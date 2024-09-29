package stacks;

import java.util.Stack;

public class postFixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> val  = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ch + "");
            }
            else{
                String s2 = val.pop();
                String s1 = val.pop();
                val.push(s1+ch+s2);
            }
        }
        System.out.println(val);
    }
}
