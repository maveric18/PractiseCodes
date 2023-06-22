package src.main.java.PG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeElements {

    public static ArrayList<Integer> twoElements(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currentSum = k - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(set.contains(currentSum-arr[j])){
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(currentSum-arr[j]);
                    break;
                }else {
                    set.add(arr[j]);
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{12, 3, 4, 16, 9, -1};
        System.out.println(twoElements(arr, 24));
    }
}
