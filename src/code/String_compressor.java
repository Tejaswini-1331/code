package code;

public class String_compressor {
    public static void main(String[] args) {
        String s = "aaabbbccddeee";
        String ans=""+ s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            char current = s.charAt(i);
            char prev = s.charAt(i-1);
            if(current ==prev){
                count++;
            }
            else{

                if(count>1) ans = ans+count;
                count =1;
                ans=ans+current;
            }
        }
        if(count>1) ans = ans+count;
        System.out.println(ans);
    }
}
