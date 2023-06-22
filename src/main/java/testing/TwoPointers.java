package src.main.java.testing;

public class TwoPointers {

    public int solve(int[] A, int B) {
        long count = 0;
        int p1 = 0;
        int p2 = A.length - 1;
        long mod = 1000000007;
        while (p1 < p2) {
            if (A[p1] + A[p2] > B) {
                p2 = p2 - 1;
            } else if (A[p1] + A[p2] < B) {
                p1 = p1 + 1;
            } else {
                int c1 = 0;
                int c2 = 0;

                int firstElement = A[p1];
                int lastElement = A[p2];
                if (firstElement == lastElement) {
                    int x = p2 - p1 + 1;
                    count = count + (x * (x - 1) / 2) % mod;
                    break;
                } else {
                    while (A[p1] == firstElement) {
                        p1++;
                        c1++;
                    }
                    while (A[p2] == lastElement) {
                        p2--;
                        c2++;
                    }
                    count = count + (c1 * c2) % mod;
                }
            }
        }
        return (int) count;
    }

    public static void main(String[] args) {
        TwoPointers pointers = new TwoPointers();
        int[] arr = {1, 2, 6, 6, 7, 9, 9};
        int B = 13;
        System.out.println("Ans---" + pointers.solve(arr, B));
    }
}
