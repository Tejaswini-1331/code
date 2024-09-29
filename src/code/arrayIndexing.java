package code;

import javax.swing.*;

public class arrayIndexing {
    static void printArray(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    static int  findsum(int [] arr){
        int totalsum=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            totalsum +=arr[i];
        }
        return totalsum;
    }
    static int [] findsufsum(int arr[]){
        int n= arr.length;
        int [] suf = new int[n];
        int j=0;
        for(int i=n-2;i>=0;i--){
            suf[j++]=arr[i]+arr[i+1];
        }
        return suf;
    }
    static boolean prefixSuffix(int [] arr){
        int n = arr.length;
        int totalsum=findsum(arr);
        int prefixSum=0;
        for(int i=0;i<n;i++) {
            prefixSum += arr[i];
           int  suffixSum = totalsum - prefixSum;
            if (suffixSum == prefixSum ) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a={5,3,2,6,3,1};
       // System.out.println(prefixSuffix(a));


    }
}
