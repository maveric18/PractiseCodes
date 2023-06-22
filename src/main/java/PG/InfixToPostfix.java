package src.main.java.PG;

import java.util.Stack;

public class InfixToPostfix {
    public String solve(String A) {
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            if(ch >='A' && ch<='Z' || ch >='a' && ch<='z'){
                postfix.append(ch);
                continue;
            }
            if(ch=='('){
                st.push(ch);
                continue;
            }
            if(ch=='^' || ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                if(st.size()==0 || st.peek()=='('){
                    st.push(ch);
                    continue;
                }else if(pri(st.peek()) < pri(ch)){
                    st.push(ch);
                    continue;
                }else if(pri(st.peek()) >= pri(ch)){
                    while(st.size()>0 && pri(st.peek())>=pri(ch)) {
                        postfix.append(st.pop());
                    }
                    st.push(ch);
                    continue;
                }
            }
            if(ch==')'){
                while(st.size()>0 && st.peek()!='('){
                    char popped = st.pop();
                    if(popped!=')' || popped !='(') {
                        postfix.append(popped);
                    }
                }
                if(st.size()>0) {
                    st.pop();
                    continue;
                }
            }
        }
        while(st.size()>0){
            postfix.append(st.pop());
        }
        return postfix.toString();
    }

    public int pri(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/'){
            return 2;
        } else if (ch=='^') {
            return 3;
        } else{
            return 0;
        }
    }
    public static void main(String[] args) {
        String str = "x/(b+t)*g*(h-o)^s/(e-z)";
        InfixToPostfix obj = new InfixToPostfix();
        System.out.println(obj.solve(str));
    }
}
