package code;

import java.util.Scanner;

public class prefixMethod3 {
    static void printArray(int [][] a){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rowSum(int [][] a){
        int r= a.length;
        int c= a[0].length;
        for(int i=0; i<r;i++){
            for(int j=1; j<c; j++){
                a[i][j]=a[i][j]+a[i][j-1];
            }
        }
    }
    static void colSum(int [][] a){
        rowSum(a);
        int r= a.length;
        int c= a[0].length;
        for(int j=0; j<c;j++){
            for(int i=1; i<r; i++){
                a[i][j]=a[i][j]+a[i-1][j];
            }
        }
    }
    static int prefixSum(int [] []a, int l1, int r1,int l2, int r2){
        int Sum=0; int left=0; int up=0; int upleft=0; int ans=0;
        colSum(a);
        // sum=sum-up-left-upleft;
            Sum = a[l2][r2];
        if(l1>=1) {
            up = a[l1 - 1][r2];
        }
            if(r1>=1) {
                left = a[l2][r1 - 1];
            }
        if(r1>=1 && l1>=1) {
            upleft = a[l1 - 1][r1 - 1];
        }
        ans = Sum-up-left+upleft;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns");
        int row=sc.nextInt();
        int col = sc.nextInt();
        int [][] array = new int[row][col];
        System.out.println("enter the "+row*col +"numbers");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        printArray(array);
        System.out.println("enter l1 & r1");
        int l1 = sc.nextInt();
        int r1 =sc.nextInt();
        System.out.println("enter l2 & r2");
        int l2 = sc.nextInt();
        int r2 =sc.nextInt();
        int ans =prefixSum(array,l1,r1,l2,r2);
        System.out.println("the sum is "+ ans);


    }
}
