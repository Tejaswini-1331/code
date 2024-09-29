package code;
public class swap_in_same_array {
    static void printArray(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    static void swap(int [] arr,int i, int j){
    int temp=0;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    static void reverse(int [] arr){
        int i=0; int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        reverse(arr);
        printArray(arr);
    }
}
