package code;

public class count_sort {
    static void display(int [] a){
        for(int i=0;i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static int findMax(int [] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    static void sot(int [] a){
        int max=findMax(a);
        int [] count=new int[max+1];
        for(int i=0;i<a.length;i++){
            count[a[i]] = count[a[i]]+1;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                a[k]=i;
                k++;
            }
        }

    }
    static void countSort(int [] a){
        int n = a.length;
        int max= findMax(a);
        int [] count = new int[max+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
            }//frequency matrix
        for(int i=1;i<count.length;i++){
            count[i] =count[i]+ count[i-1];//prefix sum
        }
        int [] output =new int[n];
        for(int i=n-1;i>=0;i--){
            int idx = count[a[i]]-1;// gives index of output array
            output[idx] = a[i];//original value is stored in output where index is given by count-1
            count[a[i]]--;
        }
        for(int i=0;i<n;i++){
            a[i]=output[i];
        }
    }
    public static void main(String [] args){
        int [] a={1,6,3,4,5,2,4};
        countSort(a);
        display(a);
    }
}
