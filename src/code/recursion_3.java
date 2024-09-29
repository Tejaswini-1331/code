package code;

import java.util.Scanner;

public class recursion_3 {
    static void multiple(int n, int k){
        int ans =0;
        if(k==1) {
            System.out.println(n);
            return;
        }
        multiple(n,k-1);
        System.out.println(n*k);
    }
    static int sum_0f_natural_numbers(int n){
        if(n==1) return n;
       return sum_0f_natural_numbers(n-1)+n;
    }
    static int sum_0f_alternative_numbers(int n){
        if(n==1) return n;
        if(n%2==0) return sum_0f_alternative_numbers(n-1)-n;
        return sum_0f_alternative_numbers(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        System.out.println(sum_0f_alternative_numbers(n));

    }
}

