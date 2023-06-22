package src.main.java.PG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer,Integer> Amap = new HashMap<>();
        for(Integer ele : A){
            if(Amap.containsKey(ele)){
                int freq = Amap.get(ele);
                Amap.put(ele,freq+1);
            }else{
                Amap.put(ele,1);
            }
        }

        HashMap<Integer,Integer> Bmap = new HashMap<>();
        for(Integer ele : B){
            if(Bmap.containsKey(ele)){
                int freq = Bmap.get(ele);
                Bmap.put(ele,freq+1);
            }else{
                Bmap.put(ele,1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : Amap.entrySet()){
            if(Bmap.containsKey(entry.getKey()) /*&& Bmap.get(entry.getKey())>=entry.getValue()*/){
                if(entry.getValue() == Bmap.get(entry.getKey())){
                    int temp = entry.getValue();
                    while (temp>0){
                        list.add(entry.getKey());
                        temp--;
                    }
                }else {
                    int temp = Math.min(entry.getValue(),Bmap.get(entry.getKey()));
                    while(temp>0){
                        list.add(entry.getKey());
                        temp--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        CommonElements elements = new CommonElements();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);A.add(2);A.add(2);A.add(1);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(2);B.add(3);B.add(1);B.add(2);
        System.out.println(elements.solve(A,B));
    }
}
