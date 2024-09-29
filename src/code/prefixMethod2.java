package code;

import java.util.Scanner;

public class prefixMethod2 {
    static void PrintArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static void matrixSum(int [][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]=matrix[i][j]+matrix[i][j-1];
            }
        }
    }
    static int  sum(int [][] a, int l1, int r1, int l2, int r2){
        int prefix =0;
        matrixSum(a);
        for(int i=l1;i<=l2;i++) {
            if (r1 >= 1) {
                prefix += a[i][r2] - a[i][r1 - 1];
            } else {
                prefix += a[i][r2];
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [] [] Trans=new int[r][c];
        System.out.println("enter the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Trans[i][j] = sc.nextInt();
            }
        }
        PrintArray(Trans);
        System.out.println("enter l1 & r1");
        int l1 = sc.nextInt();
        int r1 =sc.nextInt();
        System.out.println("enter l2 & r2");
        int l2 = sc.nextInt();
        int r2 =sc.nextInt();
        int ans =sum(Trans,l1,r1,l2,r2);
        System.out.println("the sum is "+ ans);


    }
}
