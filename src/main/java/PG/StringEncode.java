package src.main.java.PG;

import java.util.Stack;

public class StringEncode {
    public String solve(String A) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int freq = 0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>'1' && A.charAt(i)<='9'){
                freq = Character.getNumericValue(A.charAt(i));
                continue;
            }
            if(A.charAt(i)=='['){
                st.push(A.charAt(i));
                continue;
            }
            if(A.charAt(i)>='a' && A.charAt(i)<='z'){
                st.push(A.charAt(i));
                continue;
            }
            if(A.charAt(i)==']'){
                StringBuilder temp = new StringBuilder();
                while(st.peek()!='['){
                    temp.insert(0,st.pop());
                }
                while (freq>0) {
                    sb.append(temp);
                    freq--;
                }
                st.pop();
                while(st.size()>0){
                    sb.insert(0,st.pop());
                }
//                st.push(A.charAt(i));
            }
//            if(!st.isEmpty()){
//                sb.insert(i,st.pop());
//            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        StringEncode stringEncode = new StringEncode();
        System.out.println(stringEncode.solve("m5[d]q8[t]"));
    }
}
