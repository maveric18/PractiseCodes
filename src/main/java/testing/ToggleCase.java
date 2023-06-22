package src.main.java.testing;

public class ToggleCase {
    public String solve(String A) {
        String ans = "";
        char[] arr = A.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
//                arr[i] = (char)arr[i] - 32;
                ans = ans + (char)(arr[i] - 32);
            }else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                ans = ans + (char)(arr[i] + 32);
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        ToggleCase toggleCase = new ToggleCase();
        toggleCase.solve("kBDscDZnAIDZ");
    }
}
