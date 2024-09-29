package code;

public class quick_sort {
    static void display(int [] a){
        for(int i=0;i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void swap(int [] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static int partition(int [] a, int start, int end){
    int pivot = a[start];
    int count=0;
    for(int i=start+1;i<=end;i++){
        if(a[i]<=pivot) count++;
    }
    int pivotIndex=start+count;
    swap(a,start,pivotIndex);
    int i=start; int j=end;
    while(i<pivotIndex && j>pivotIndex){
        while(a[i]<=pivot) i++;
        while(a[j]>pivot) j--;
        if(i<pivotIndex && j>pivotIndex) swap(a,i,j);
        i++;
        j--;
    }
    return pivotIndex;
    }
    static void quickSort(int [] a, int start,int end){
        if(start>=end) return;
        int pi = partition(a,start,end);
        quickSort(a,start,pi-1);
        quickSort(a,pi+1,end);
    }
    public static void main(String[] args) {
        int [] a ={3,4,0,5,6,2,4,7,1};
        display(a);
        quickSort(a,0,a.length-1);
        display(a);
    }
}
