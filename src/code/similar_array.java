package code;

import java.util.Scanner;

public class similar_array {
    static int find(int [] a){
        int check=-1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                   return a[i];
                }
            }
        }
        return check;
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
        System.out.println(" ");
        System.out.println("the repeated number is " + find(a));
    }
}
