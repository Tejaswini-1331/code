package code;

import java.util.Scanner;

public class swap {
    static void printArray(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a +" "+ b);
    }
    static void swapSum(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a: "+a + " " + "b: "+ b);
    }
    static int[] reverseArray(int [] array){
        int n=array.length;
        int [] ans = new int [n];
        int j=0;
        for(int i=array.length-1;i>=0;i--){
            ans[j++]=array[i];
        }
        return ans;
    }
    public static void main(String[] args) {

        int [] a ={1,2,3,4,5};
        int [] ans= reverseArray(a);
        printArray(ans);
       // System.out.println(reverseArray(a));
    }
}
