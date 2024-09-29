package code;

public class zeros {
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
    static void zerosOnes(int [] arr){
        int n=arr.length;
        int zero =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void swapZeroOne(int [] arr){
        int n=arr.length;
        int i=0; int j=n-1;
        while(i<j){
                if(arr[i]==1 && arr[j]==0) {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
                if(arr[i]==0){
                    i++;
                }
            if(arr[j]==1){
                j--;
            }


        }

    }
    public static void main(String[] args) {
        int[] a = {1,1,1, 0,0,1,0,1,1,1,};
        //zerosOnes(a);
        swapZeroOne(a);
        printArray(a);
    }

}
