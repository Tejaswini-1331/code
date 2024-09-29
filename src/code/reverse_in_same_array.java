package code;

public class reverse_in_same_array {
    static void printArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int [] swap(int [] arr,int k){
        int n = arr.length;
         k=k%n;
         int [] ans = new int[n];
         int j=0;
         for(int i=n-k;i<n;i++){
             ans[j++]=arr[i];
         }
         for(int i=0;i<n-k;i++){   //I<=N-K-1 CAN ALSO BE WRITTEN
         ans[j++]=arr[i];
         }
return ans;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int k=7;
        int abb []=swap(a,k);
        printArray(abb);

    }
}
