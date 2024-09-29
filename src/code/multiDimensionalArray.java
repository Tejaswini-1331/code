package code;
import java.util.*;

public class multiDimensionalArray {
    static void printArray(int [] []arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
        static int [][] multiplication(int [][]a, int r1,int c1, int [][]b, int r2,int c2) {
        int [] [] mul = new int [r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            return mul;
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of matrix A");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] A = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        printArray(A);

        System.out.println("enter the number of rows  and columns of matrix B");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] B = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        printArray(B);
        int [][] ans = multiplication(A,r1,c1,B,r2,c2);
        printArray(ans);
    }
}
