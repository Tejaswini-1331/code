package backTracking;

public class print_string {
    public static void printp(String s, String t)
    {
        if(s.length()==0){
            System.out.print(t+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt((i));
            String left = s.substring(0,i);
            String right= s.substring(i+1);
            String rem = left+right;
            printp(rem,t+ch);
        }
    }
    public static void main(String[] args) {
        printp("123","");
    }
}
