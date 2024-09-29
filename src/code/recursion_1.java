package code;

import java.util.Scanner;

public class recursion_1 {
    static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int ans = n*factorial(n-1);
        return ans;
    }
    static int fibonacci(int n){
        if(n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
