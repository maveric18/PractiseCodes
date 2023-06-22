package src.main.java.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSortingClass {
    int rollNo;
    String name;
    public CustomSortingClass(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public static void main(String[] args) {
        ArrayList<CustomSortingClass> list = new ArrayList<>();

        CustomSortingClass cs1 = new CustomSortingClass(24,"Sachin");
        CustomSortingClass cs2 = new CustomSortingClass(12,"Smita");
        CustomSortingClass cs3 = new CustomSortingClass(34,"Sachin-Smita");
        list.add(cs1); list.add(cs2); list.add(cs3);

        System.out.println("unsorted---");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).rollNo + "  " + list.get(i).name);
        }

        Collections.sort(list, new Comparator<CustomSortingClass>() {
            @Override
            public int compare(CustomSortingClass o1, CustomSortingClass o2) {
                if(o1.rollNo<o2.rollNo){
                    return -1;
                } else if (o1.rollNo>o2.rollNo) {
                    return 1;
                }else
                    return 0;
            }
        });
        System.out.println("sorted---");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).rollNo + "  " + list.get(i).name);
        }
    }
}
