package code;
import java.util.*;
public class array_2 {
    static int countArray(int []a ,int x ) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        return count;
    }
        static int lastIndex(int [] a,int x){
            int ans=-1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == x) {
                    ans=i;
                }
            }
            if(ans==-1){
                System.out.println("not found");
            }
            return ans;
    }
    static int countLarge(int [] a,int x){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]> x) {
                count++;
            }
        }
        return count;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int [] a= {1,2,3,4,3,5};
        System.out.println(countLarge(a,x));



    }
}

