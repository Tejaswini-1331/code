package code;

public class reverse {
    static void printArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int [] reverseArray(int [] array){
        int n=array.length;
        int[] ans = new int[n];
        int i=n-1,j=0;
        while(i>=0){
            ans[j++]=array[i--];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int [] ans=reverseArray(a);
        printArray(ans);
    }
}
