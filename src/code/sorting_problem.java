package code;

public class sorting_problem {
    static void sort(int [] arr){
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
            if(flag == false) {
                return;
            }
        }
    }
    static void lexicograph(String [] fruits){
        for(int i=0;i<fruits.length-1;i++){
           int min_index=i;
           for(int j=i+1;j<fruits.length;j++){
               if(fruits[j].compareTo(fruits[min_index])<0){
                 min_index=j;
               }
           }
           String temp = fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
    }
    public static void main(String[] args) {
     String [] a ={"kiwi","apple","mango","papaya"};
     lexicograph(a);
     for(String ans:a){
         System.out.print(ans + " ");
     }
    }
}
