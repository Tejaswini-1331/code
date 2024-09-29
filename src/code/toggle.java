package code;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        for(int i=0;i<s.length();i++){
            boolean flag = true;
            char ch = s.charAt(i);
            if(ch ==' ') continue;
            int ascii_value = (int) ch;
            if(ascii_value<=65) continue;
            if(ascii_value>=97) flag = false; //small letter =97 capital=65;P
            if(flag==true){
                ascii_value+=32;
                char dh = (char)ascii_value;
                s.setCharAt(i,dh);
            }
            else{
                ascii_value=ascii_value-32;
                char dh = (char)ascii_value;
                s.setCharAt(i,dh);
            }
        }
        System.out.println(s);
    }
}
