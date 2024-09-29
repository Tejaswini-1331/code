package code;

import java.util.*;
import java.util.Scanner;

public class recursion_6 {
//CODE FOR RETURNING YES OR NO;
    static boolean search( int [] arr, int index, int target){
        if(index==arr.length) return false;
        if(arr[index]==target) return true;
        return search(arr,index+1,target);
    }

    //CODE FOR RETURN INDEX
    static int search_index(int [] arr, int index, int target){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return search_index(arr,index+1,target);
    }
    // CODE FOR RETURNING ALL INDICES
    static void find(int [] arr, int target, int index){
        if(index==arr.length) return;
        if(arr[index]==target){
            System.out.print(index+ " ");
        }
        find(arr,target,index+1);
    }
    // CODE USING ARRAYLIST
    static ArrayList<Integer> findAll(int [] arr, int index, int target){
        if(index==arr.length) return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[index]==target){
             ans.add(index);
        }
        ArrayList<Integer> smallAns = findAll(arr,index+1,target);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,5,4,5,4};
        int target = 4;
        System.out.println(findAll(array,0,target));
    }
}
