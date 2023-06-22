package src.main.java.testing;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    public static void mergeSorting(int[] arr, int left, int right){
        if(left==right)
            return;
        int mid = (left+right)/2;
        mergeSorting(arr,left,mid);
        mergeSorting(arr,mid+1,right);
        merge(arr, left, mid, right);
        System.out.println("Merge sorted array--" + Arrays.toString(arr));
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] sortedArray = new int[right-left+1];
        int p1 = left;
        int p2 = mid+1;
        int k = 0;
        while (p1<=mid && p2 <=right){
            if(arr[p1]<arr[p2]){
                sortedArray[k] = arr[p1];
                p1++;
                k++;
            }else {
                sortedArray[k] = arr[p2];
                p2++;
                k++;
            }
        }
        while(p1<=mid){
            sortedArray[k] = arr[p1];
            p1++;
            k++;
        }
        while (p2<=right){
            sortedArray[k] = arr[p2];
            p2++;
            k++;
        }
        for(int i=0;i<sortedArray.length;i++){
            arr[i+left] = sortedArray[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,10,2,1,5};
        int left = 0;
        int right = arr.length-1;
        mergeSorting(arr,left,right);
    }
}
