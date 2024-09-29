package code;
import java.util.*;
public class target_sum {
    static int sum(int [] a,int target){
        int ans=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]+a[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int triplet(int []a,int target){
        int ans=0;
        for(int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == target) {
                        System.out.println(a[i] + " " + a[j] +" "+ a[k]);
                        ans++;
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int [] a=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("enter the target sum");
        int target=sc.nextInt();
        System.out.println(triplet(a,target));


    }

}
