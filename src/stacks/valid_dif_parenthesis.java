package stacks;

import java.util.Stack;

public class valid_dif_parenthesis {
    public static boolean isValid(String a){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch=='('|| ch=='['||ch=='{' ){
                st.push(ch);
            }
            else if(ch==')'|| ch==']'||ch=='}') {
                if (st.isEmpty()) return false;
                if (ch == ')' && st.peek() == '(') st.pop();
                else return false;
                if (ch == '}' && st.peek() == '{') st.pop();
                if (ch == ']' && st.peek() == '[') st.pop();
            }
                else return false;


        }
        if(st.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }
}
