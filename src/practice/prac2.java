package practice;

import java.util.Arrays;

public class prac2 {

    public static void main(String[] args) {
        int [] a = {2,3,4,1,34};
        for(int i =0; i<a.length; i++){
            for(int j = i+1; j<a.length-1; j++){
              if(a[i]>a[j]) {
                  int temp = a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
            }
        }
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
