package code;

public class squareOfNumbers {
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

    static void reverse(int[] arr, int start,int end) {
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static int [] parity(int [] arr){
        int n =arr.length;
        int left=0,right=arr.length-1;
        int k=0;
        int[] ans = new int[n];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
     return ans;
    }
    public static void main(String[] args) {
    int [] a= {1,2,3,4,5};
    int n= a.length;
           int ans [] = parity(a);
            reverse(ans,0,n-1);
            printArray(ans);


    }
}
