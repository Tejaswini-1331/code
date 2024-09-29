package stacks;
import java.util.*;
public class valid_brackets {
    public static boolean isbalanced(String str){
        Stack<Character> st = new Stack<>();
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch=='('){
               st.push(ch);
           }
           else{
               if(st.isEmpty()) return false;
               else st.pop();
           }
       }
       if(st.isEmpty()) return true;
       return false;
    }
    public static void main(String[] args) {
        String a = "()())))";
        System.out.println(isbalanced(a));
    }
}
