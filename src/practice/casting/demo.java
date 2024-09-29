package practice.casting;

//import java.util.Scanner;
public class demo {
    public static void main(String[] args) {

     int [] a = {1,2,3,4,5};
      int s =9; int t=0; int ans=0;
     try{
         System.out.println(a[10]);
     }

     catch(NullPointerException e){
         System.out.println(e);
     }
     catch(Exception e){
         System.out.println(e);
     }
     finally {
         System.out.println("end");
     }

    }
}
