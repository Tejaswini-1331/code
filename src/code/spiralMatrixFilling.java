package code;

import java.util.Scanner;

public class spiralMatrixFilling {
    static void PrintArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static int [][] SpiralMatrix(int n){
        int [][] matrix = new int[n][n];
        int currentElement =1;
        int topRow =0,bottomRow=n-1,leftCol=0, rightCol=n-1;
        while(currentElement<=n*n){
             for(int i=topRow;i<=bottomRow;i++){
                 matrix[i][leftCol]=currentElement;
                 currentElement++;
             }
             leftCol++;
             for(int i=leftCol;i<=rightCol;i++){
                 matrix[bottomRow][i]=currentElement;
                 currentElement++;
             }
             bottomRow--;
             for(int i =bottomRow;i>=topRow;i--){
                 matrix[i][rightCol]=currentElement;
                 currentElement++;
             }
             rightCol--;
            for(int i = rightCol;i>=leftCol;i--){
                matrix[topRow][i]=currentElement;
                currentElement++;
            }
            topRow++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int [][] ans =SpiralMatrix(n);
        PrintArray(ans);

    }
}
