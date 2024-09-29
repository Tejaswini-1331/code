package code;

import java.util.Scanner;

public class rotationOfMatrix {
    static  void printArray(int [][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static void transpose(int [][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
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
            i++;
            j--;
        }
    }
    static void rotate(int [][]a,int n){
        transpose(a,n,n);
        for(int i=0;i<n;i++) {
            reverse(a[i]);
        }
    }
    static int [][]pascal(int n){
        int [][] ans =new int[n][];
    for(int i=0;i<n;i++) {
        ans[i] = new int[i + 1];
        ans[i][0] = ans[i][i] = 1;
        for (int j = 1; j < i; j++) {
            ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int [][] ans = pascal(n);
        printArray(ans);



    }
}
