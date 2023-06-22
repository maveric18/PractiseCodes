package src.main.java.PG;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Stacks {

    public static ArrayList<Integer> maxOnRight(ArrayList<Integer> A){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[A.size()];
        for(int i=A.size()-1;i>=0;i--){
            while(st.size()>0 && A.get(i)>= st.peek()){
                st.pop();
            }
            if(st.size()>0){
//                list.add(i,st.peek());
                arr[i] = st.peek();
            }else{
//                list.add(i,-1);
                arr[i] = -1;
            }
            // System.out.println(i);
            st.push(A.get(i));
        }
        for(int i : arr)
            list.add(i);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("2");
        A.add("2");
        A.add("/");

        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<A.size();i++){
            String ch = A.get(i);
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(String.valueOf(ch)));
            }else{
                if(ch.equals("+")){
                    ans = st.pop() + st.pop();
                }else if(ch.equals("-")){
                    ans = st.pop() - st.pop();
                }else if(ch.equals("*")){
                    ans = st.pop() * st.pop();
                }else {
                    ans = st.pop() / st.pop();
                }
//                ans = st.pop() + ch.replace(" ", "") + st.pop();
                st.push(ans);
            }
        }
        System.out.println(ans);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);list.add(5);list.add(2);list.add(10);
        System.out.println(maxOnRight(list));
    }
}
