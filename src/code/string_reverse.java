package code;

public class string_reverse {
    public static void main(String[] args) {
        String s = "teju";

        String rev = "";
        for(int i =0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
            System.out.println(rev);
        }
    }
}
