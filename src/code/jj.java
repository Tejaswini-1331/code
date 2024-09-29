package code;
import java.util.*;
class arrays{
    Scanner sc = new Scanner(System.in);
    void array(){
        int [] num = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i =0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }
    void max() {
        int[] num = {1, 2, 3, 84, 5, 6,100, 7, 8, 9};
        int ans = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>ans) {
                ans=num[i];
            }
        }
        System.out.println(ans);
    }
    void element(){
        int[] num = {1, 2, 3, 84};
        System.out.println("Enter the element");
        int x=sc.nextInt();
        int ans = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                ans=i;
                break;
            }
        }
        System.out.println(ans);
        System.out.println(num.length);
    }









}
public class jj {
    public static void main(String[] args) {
        arrays teju = new arrays();

        teju.element();
    }
}

