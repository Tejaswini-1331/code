package FidelityAfter.InterviewPracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

    public static List<int []> sum(int [] arr, int target){
        List<int []> list = new ArrayList<>();

        for(int i=0; i<arr.length -1 ; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+arr[j] == target){
                    list.add(new int[]{i,j});
                }
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,3,3,5,7};
        int target = 6;
        List<int []> list = sum(arr,target);
        for(int [] a:list){
            for(int num: a){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
