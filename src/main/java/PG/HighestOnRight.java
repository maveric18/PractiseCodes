package src.main.java.PG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class HighestOnRight {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[A.size()];
        for(int i=A.size()-1;i>=0;i--){
            while(st.size()>0 && A.get(i)>A.get(st.peek())){
                st.pop();
            }
            if(st.size()>0){
                arr[i] = st.peek()-i;
//                list.add(st.peek()-i);
            }else{
                arr[i] = 0;
            }
            st.push(i);
        }
        for(int i: arr){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        HighestOnRight highestOnRight = new HighestOnRight();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(35);list.add(57);list.add(36);list.add(93);
        System.out.println(highestOnRight.solve(list));
    }
}
