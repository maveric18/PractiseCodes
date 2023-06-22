package src.main.java.testing;

import java.util.Arrays;
import java.util.Collections;

public class CeilSearchElement {
    public int solve(int A, int[] B, int C) {
        int ans = -1;
        int left = 0;
        int right = A-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(B[mid]==C){
                return B[mid];
            }else if(B[mid]<C){
                left = mid+1;
            }else{
                ans = B[mid];
                right = mid-1;
            }
        }
        return ans;
    }
    public static int prodMax(int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i] = arr[i] * -1;
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int prod = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
        return prod;
    }

    public static void main(String[] args) {
//        int[] arr = {-86, -84, -68, -62, -48, -45, -34, -27, -12, 1, 18, 22, 49, 61, 88};
//        CeilSearchElement cs = new CeilSearchElement();
//        System.out.println(cs.solve(arr.length,arr,100));
        int[] array = {-7,-9,-7,2,-9,7,-8,6,-1};
        System.out.println(Arrays.toString(array));
        System.out.println(prodMax(array));
    }
}
