package alpha;

import java.util.Scanner;

public class changingCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chArr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch = chArr[i];
            int value = ch;
            if(value>=65 && value<=90){
                value = value+32;
            }
            else{
                value= value-32;
            }
            ch = (char) value;
           chArr[i] = ch;
        }
        String h =chArr.toString();
        System.out.println(h);
    }
}
