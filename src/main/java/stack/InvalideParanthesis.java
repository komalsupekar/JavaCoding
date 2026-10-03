package stack;

import java.util.Stack;

public class InvalideParanthesis {
    public static void main(String args[]){
        String str = "{}[]";

        Stack<Character>st = new Stack<>();
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else if(st.isEmpty()){
                flag=true;
                break;
            }
            //else {
                char popC = st.pop();
                if ((str.charAt(i) == '}' && (popC != '[' || popC != '(')) ||
                        (str.charAt(i) == ')' && (popC != '[' || popC != '{')) ||
                        (str.charAt(i) == ']' && (popC != '{' || popC != '('))) {
                    flag = true;
                }
            //}

        }
        if(flag && st.isEmpty()){
            System.out.println("valid parenthesis");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
