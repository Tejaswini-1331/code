package code;

public class string_reverse {
    public static void main(String[] args) {
        String s = "teju";
        char[] a = s.toCharArray();
        String t = "";
        char ch;
        for (int i = 0; i<4;i++) {
            t = a[i]+t;
        }
        System.out.println(t);
    }
}
