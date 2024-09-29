package code;

import java.util.Scanner;

public class prefix {
    static void printArray(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    static int [] makePrefixSum(int [] arr){
        int n= arr.length;
        int prefix [] = new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    static int [] makePrefixSumInSameArray(int [] arr) {
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
        int [] arr = new int[n];
        System.out.println("Enter the array");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }


    }
}
