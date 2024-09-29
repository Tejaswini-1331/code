package code;
import java.util.Arrays;

public class sort {
    static boolean isSorted(int [] a){
        boolean check = true;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]) {
                check= false;
            }
            }
        return check;
    }
static int [] sortedArraySmallLarge(int [] a){
        Arrays.sort(a);
        int [] ans={a[0],a[a.length-1]};
        return ans;
}

    public static void main(String[] args) {
        int [] a= {2,3,4,5,8,8};
       int [] ans=sortedArraySmallLarge( a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);


    }
}
