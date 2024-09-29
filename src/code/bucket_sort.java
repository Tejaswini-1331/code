package code;
import java.util.*;
public class bucket_sort {
    static void display(float [] a){
        for(int i=0;i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void sort(float [] a) {
        int n = a.length;
        ArrayList<Float>[] bucket = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) a[i] * n;
            bucket[bucketIndex].add(a[i]);
        }
        //sort
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }
        //merg
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            ArrayList<Float> output = bucket[i];
            for (int j = 0; j < output.size(); j++) {
                a[index++] = output.get(j);
            }
        }
    }
        public static void main(String [] args){
            float [] a = {0.23f,0.98f,0.8f,0.6f,0.4f};
            sort(a);
            display(a);

    }
}
