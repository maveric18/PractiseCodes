package src.main.java.PG;

import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arrN = new int[N];
        for (int i=0;i<N;i++){
            arrN[i] = sc.nextInt();
        }
        int[] arrM = new int[M];
        for (int i=0;i<M;i++){
            arrM[i] = sc.nextInt();
        }

        int[] result = new int[M];
        int r = 0;

        for(int k=0;k<M;k++){
            int sum = 0;
            for(int l=0;l<N;l++){
                sum = sum + Math.abs(arrN[l] - arrM[k]);
            }
            result[r] = sum;
            r++;
        }
        for(int ele : result){
            System.out.print(ele + " ");
        }
    }
}