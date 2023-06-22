package src.main.java.testing;

public class INC {
    public static int digitSum(int A) {
        int value = digitSum2(A);
        if(value == 1){
            return 1;
        }
        return 0;
    }
    public static int digitSum2(int A){
        if(A<10){
            return A;
        }
        int value =digitSum2(A/10) + A%10;
        if(value>=10){
            value = digitSum2(value);
        }
        return value;
    }
    public static void increment(int N){
        if(N==1){
            System.out.print(N + " ");
            return;
        }
        increment(N-1);
        System.out.print(N + " ");
    }

    public static int powWithMod(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if(A<0){
            A = (A%C + C)%C;
        }
        if(B==0){
            return 1%C;
        }
        long temp = powWithMod(A,B/2,C);
        if(B%2==0){
            return (int)(temp * temp)%C;
        }
        return (int)((temp * temp)%C * A%C)%C;
    }

    public static void main(String[] args) {
        increment(9);
        powWithMod(71045970,41535484,64735492);
        System.out.println();
        System.out.println(digitSum(83557));
    }
}