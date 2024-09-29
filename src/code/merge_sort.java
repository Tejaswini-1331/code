package code;

public class merge_sort{
    static void display(int [] a){
        for(int i=0;i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void merge(int [] a,int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) left[i] = a[l + i];
        for (j = 0; j < n2; j++) right[j] = a[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                a[k++] = left[i++];
            else
                a[k++] = right[j++];
        }

            while (i < n1)
                a[k++] = left[i++];
            while (j < n2)
                a[k++] = right[j++];
    }

    static void sort(int []a, int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        sort(a,l,mid);
        sort(a,mid+1,r);
        merge(a,l,mid,r);
    }

    public static void main(String[] args) {
        int [] a ={4,0,5,2,3,8,0};
        display(a);
        sort(a,0,a.length-1);
        display(a);

    }
}
