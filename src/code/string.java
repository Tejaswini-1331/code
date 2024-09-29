package code;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String a = "abcd";
       for(int i=0;i<a.length()+1;i++){
           for(int j=i+1;j<=a.length();j++){
           System.out.print(a.substring(i,j) + " ");
       }

    }
   }
}
