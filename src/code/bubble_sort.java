package code;

public class bubble_sort {
    static void arr(int [] n){
        boolean flag = false;
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-i-1;j++){
                if(n[j]>n[j+1]){
                    int temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] n ={6,5,4,3,2,1};
        arr(n);
        for(int ans:n) {
            System.out.print(ans + " ");
        }
    }
}
