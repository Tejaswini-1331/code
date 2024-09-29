package code;

public class rotate {

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void swap(int [] arr,int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int[] arr, int start,int end) {
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void rotate(int [] arr, int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int k = 6;
        reverse(a,0,5); // it reverse
        printArray(a);
        rotate(a, k); // it rotates
        printArray(a);
    }
}
