package code;

import java.util.Scanner;

public class second_max{
    static int firstLarge(int [] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
    static int secondLarge(int [] a) {
        int max = firstLarge(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax=firstLarge(a);

        return secondMax;
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
        System.out.println("the large number is " + firstLarge(a));
        System.out.println("the second large number is " + secondLarge(a));
    }
}
