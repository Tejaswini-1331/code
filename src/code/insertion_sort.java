package code;

public class insertion_sort {
    static void sort(int [] a){
        for(int i=1; i<a.length;i++ ) {
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }

    }
    public static void main(String[] args) {
        int [] a={2,3,9,4,7,5};
        sort(a);
        for(int ans:a){
            System.out.print(ans+ " ");
        }
    }
}
