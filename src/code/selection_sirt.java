package code;

public class selection_sirt {
    static int [] selection(int [] arr){
        for(int i =0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[min]>arr[j]){
                   min=j;
               }
            }
           int temp =arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    public static void main(String [] args) {
    int [] a = {7,5,4,1,3};
    selection(a);
    for(int ans:a){
        System.out.print(ans + " ");
    }
    }
}
