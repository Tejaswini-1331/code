package code;

public class sorting_problems {
    static void display(int [] a){
        for(int i=0;i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void swap(int [] a,int x, int y){
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void sort(int [] a){
        int x=-1; int y=-1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        int temp = a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void partition(int [] a, int left,int right){
        int pivot = 0;
        while(left<right) {
            while (a[left] < pivot) left++;
            while (a[right] > pivot) right--;

            if(left<right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }
    static void sort_0s_1s(int [] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
             swap(a,low,mid);
             low++;
             mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,high,mid);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int [] a={2,1,0,1,0,0,2,1};
        sort_0s_1s(a);
        display(a);
    }
}
