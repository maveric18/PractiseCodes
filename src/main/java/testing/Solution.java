package src.main.java.testing;
public class Solution {
    public int answer = 0;
    public int solve(int[] A) {
        int start = 0;
        int end = A.length-1;
        mergeSort(A, start, end);
        return answer;
    }

    public void mergeSort(int[]arr, int left, int right){
        if(left==right){
            return;
        }
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public void merge(int[]arr, int left, int mid, int right){
        int p1 = left;
        int p2 = mid+1;
        int k = 0;
        int[] sortedArray = new int[right-left+1];
        while (p1<=mid && p2 <=right){
            if(arr[p1]<=arr[p2]){
                sortedArray[k] = arr[p1];
                p1++;
                k++;
            }else if(arr[p1]>arr[p2]) {
                sortedArray[k] = arr[p2];
                p2++;
                k++;
                answer = answer + (mid - p1 + 1);
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
        Solution s = new Solution();
        int[] arr = {10,3,8,15,6,12,2,18,7,1 };
        System.out.println(s.solve(arr));
    }
}

