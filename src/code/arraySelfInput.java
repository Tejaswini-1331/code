package code;

import java.util.Scanner;

public class arraySelfInput {
    static int [] l_To_r(int [] arr){
        int n = arr.length;
        arr[0]=arr[0];
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        System.out.print("Enter the array");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter l range");
        int l = sc.nextInt();
        System.out.println("enter r range");
        int r = sc.nextInt();

        int [] prefsum = l_To_r(arr);
        int ans= prefsum[r] - prefsum[l-1];
        System.out.print(ans);
    }
}
