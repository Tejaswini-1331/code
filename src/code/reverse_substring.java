package code;

public class reverse_substring {
    public static void main(String[] args) {
        String s = "I am an online educator 456";
        String ans="";
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }
            else{
                str.reverse();
                ans=ans+str+" ";
                str = new StringBuilder("");
            }
        }

        System.out.println(ans+str.reverse());
    }
}
