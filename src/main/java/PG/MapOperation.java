package src.main.java.PG;

import java.util.*;

public class MapOperation {

    class frequency{
        Character ch;
        Integer freq;

        frequency(Character ch,Integer freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String solve(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < A.length()) {
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i), map.get(A.charAt(i)) + 1);
            }else{
                map.put(A.charAt(i), 1);
            }
            i++;
        }
        ArrayList<frequency> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list.add(new frequency(entry.getKey(),entry.getValue()));
        }
        Collections.sort(list, new Comparator<frequency>() {
            @Override
            public int compare(frequency o1, frequency o2) {
                if(o1.freq>o2.freq){
                    return -1;
                }else if(o1.freq==o2.freq){
                    if(o1.ch<o2.ch){
                        return -1;
                    }
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for (frequency k : list){
            while(k.freq>0) {
                sb.append(k.ch);
                k.freq--;
            }
        }
        System.out.print(sb);
        return new String(sb);
    }

    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('s',1);
        map.put('c',2);
        map.put('a',3);
        map.put('l',1);
        map.put('e',2);
        map.put('r',1);
        map.put('d',1);
        map.put('m',1);
        map.put('y',1);
        MapOperation op = new MapOperation();
        op.solve("scaleracademy");
        Stack<Integer> st = new Stack<>();
    }
}
