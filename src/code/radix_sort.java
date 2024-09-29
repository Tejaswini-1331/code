package code;

public class radix_sort {
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
    static void countSort(int [] a, int place) {
        int n = a.length;
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(a[i]/place)%10]++;
        }                             //frequency of the place of matrix[100,10,1]
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];//prefix sum
        }
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(a[i]/place)%10] - 1;// gives index of output array
            output[idx] = a[i];//original value is stored in output where index is given by count-1
            count[(a[i]/place)%10]--;
        }
        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }
    static void radix(int [] a){
        int max = findMax(a);
        for(int place =1; max/place>0;place *=10){
            countSort(a,place);
        }
    }
        public static void main(String [] args){
        int [] a={1,161,543,6,67,456};
        radix(a);
        display(a);

    }
}
