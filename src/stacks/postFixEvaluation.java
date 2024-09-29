package stacks;

import java.util.Stack;

public class postFixEvaluation {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<Integer> val  = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int val2 = val.pop();
                int val1 = val.pop();
                if(ch=='+') val.push(val1+val2);
                if(ch=='-') val.push(val1-val2);
                if(ch=='*') val.push(val1*val2);
                if(ch=='/') val.push(val1/val2);
            }
        }
        System.out.println(val);
    }
}
