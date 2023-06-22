package src.main.java.PG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestPalindrome {
    public String longestPalindrome(String A) {
        int ans = 0;
        String str = "";
        int len = A.length();
        for (int i = 0; i < len - 1; i++) {
            int p1 = i;
            int p2 = i + 1;
            String palLen = expand(A, p1, p2);
            if(palLen.length()>ans){
                str = palLen;
                ans = palLen.length();
            }
        }

        for (int i = 0; i < len; i++) {
            int p1 = i;
            int p2 = i;
            String palLen = expand(A, p1, p2);
            if(palLen.length()>ans){
                str = palLen;
                ans = palLen.length();
            }
        }
        return str;
    }

    public String expand(String str, int p1, int p2) {
        while (p1 >= 0 && p2 < str.length() && str.charAt(p1) == str.charAt(p2)) {
            p1 = p1 - 1;
            p2 = p2 + 1;
        }
        return str.substring(p1+1,p2);
//        return p2 - p1 - 1;
    }


    //sort array using count sort
    public int[] sortedArray(int[] A) {
        int max = A[0];
        for (int i : A){
            max = Math.max(max,i);
        }
        int[] freqArr = new int[max+1];

        for(int i=0;i<A.length;i++){
            freqArr[A[i]] = freqArr[A[i]] + 1;
        }

        int[] sortedArr = new int[A.length];
        int j=0;
        for(int i=0;i<freqArr.length;i++){
            while(freqArr[i]>0){
                sortedArr[j] = i;
                j++;
                freqArr[i]--;
            }
        }
        return sortedArr;
    }

    void printPat(int n)
    {
        // Your code here
        for(int i=0;i<n;i++){
            for(int j=n ; j>0 ; j--){
                for (int k=n;k>i;k--) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("$");
        }
    }
    public int[] solve(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[] arrFinal = new int[n*m];
        ArrayList<Integer> list = new ArrayList<>();
        list.toArray();
        int k = 0;
        //for first row
        for (int i = 0; i < m; i++) {
            arrFinal[k] = arr[0][i];
            k++;
        }
        //now last column
        for (int i = 1; i < n; i++) {
            arrFinal[k] = arr[i][m - 1];
            k++;
        }
        //now last row
        if (n > 1) {
            for (int i = m - 2; i >= 0; i--) {
                arrFinal[k] = arr[n - 1][i];
                k++;
            }
        }
        if (m > 1) {
            for (int i = n - 2; i >= 1; i--) {
                arrFinal[k] = arr[i][0];
                k++;
            }
        }

        System.out.println("\n---" + Arrays.toString(arrFinal));
        return arrFinal;
    }

    public String shuffleString(String A, ArrayList<Integer> B) {
        char[] arr = new char[B.size()];
        for(int i=0;i<B.size();i++){
            arr[B.get(i)]=A.charAt(i);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();
//        System.out.println(obj.longestPalindrome("abb"));
        int[] arr = {6,3,3,6,7,8,7,3,7,13};
        System.out.println("---------------");
//        System.out.println("---"+Arrays.toString(obj.sortedArray(arr)));
        System.out.println("---------------");
        obj.printPat(3);
        int[][] newArr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        obj.solve(newArr);

        String str = "jatdqaizs";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(6);
        System.out.println(obj.shuffleString(str,list));

    }

}
