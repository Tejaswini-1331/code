package code;

public class evenOdd {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static void swap(int [] arr, int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void arrange(int [] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 == 1) {
                j--;
            }
        }
    }



    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,8,6};
        arrange(a);
        printArray(a);
    }
}
