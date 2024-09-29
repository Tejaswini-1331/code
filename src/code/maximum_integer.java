package code;
import java.util.*;
public class maximum_integer {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=0;i<n;i++){
         for(int j=1;j<=i;j++){
             System.out.print(" ");
         }
         for(int k=0;k<n-i;k++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
