package code;

import java.util.Scanner;

public class transposeOfArrays {
    static  void printArray(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
        static int [][]transpose(int [][] A, int r1,int c1){
           int [][] ans = new int [c1][r1] ;
           for(int i=0;i<c1;i++){
               for(int j=0;j<r1;j++){
                   ans[i][j]=A[j][i];
               }
            }
           return ans;
        }
        static void swap(int [][] array,int i,int j){
        int temp=0;
        temp = array[i][j];
        array[i][j]=array[j][i];
        array[j][i] = temp;
        }
        static void transposeInArray(int [][]matrix,int r1,int c1 ){
        for(int i=0;i<c1;i++){
            for(int j=i;j<r1;j++){     // j should start from i for only upper triangle
                int temp=0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverse(int [] a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=0;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    static void rotate(int [][] matrix, int n){
     transposeInArray(matrix,n,n);
     for(int i=0;i<n;i++) {
         reverse(matrix[i]);
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the number of rows and columns");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [] [] Trans=new int[r1][c1];
        System.out.println("eneter the matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
               Trans[i][j] = sc.nextInt();
            }
        }
        printArray(Trans);
       rotate(Trans,r1);
        printArray(Trans);

       // int [][] ans=transpose(Trans,r1,c1);
       // System.out.println("The transpose ,matrix is");
      //  printArray(ans);


    }
}
