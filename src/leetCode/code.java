package leetCode;

import java.util.*;

public class code {
    public static void main(String[] args) {
     String  S = "AHDVhj";
     char [] st =S.toCharArray();
     StringBuilder ans = new StringBuilder();
     for(int i=0; i<S.length();i++){

         if(st[i]>='A' && st[i]<='Z'){
             char ch = st[i];
             char newCh = (char) (ch+32);
             ans.append(newCh);
         }
         else{
             ans.append(st[i]);
         }

     }

        System.out.println(ans);

    }

}
