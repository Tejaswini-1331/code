package code;

import java.util.Scanner;

public class spiralMatrixPrint {
    static  void printArray(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static void spiral(int [][]matrix, int r, int c){
        int totalElements =0;
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        while(totalElements<r*c){
            for(int i=leftCol;i<=rightCol && totalElements<r*c;i++){
                System.out.print(matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;

            for(int j =topRow;j<=bottomRow && totalElements<r*c;j++){
                System.out.print(matrix[j][rightCol] +  " ");
                totalElements++;
            }
            rightCol--;

            for(int i = rightCol;i>=leftCol && totalElements<r*c;i--){
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;

            for(int j=bottomRow;j>=topRow && totalElements<r*c;j--){
                System.out.print(matrix[j][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of matrix A");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("enter the "+r*c+" elements");
        int [][] A = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        printArray(A);
        System.out.println("the sprial numbers are ");
        spiral(A,r,c);


    }
}
