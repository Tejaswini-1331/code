package backTracking;
import java.util.*;
public class permutations {
    public static void helper(int [] nums, int idx,List<List<Integer>> ans){
     if(idx == nums.length-1){
         List<Integer> l = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
             l.add(nums[i]);  // adding numbers in list;
         }
         ans.add(l); // adding list in list
         return;
     }
     for(int i = idx; i<nums.length; i ++){
         swap(idx,i,nums);
         helper(nums,idx+1,ans);
         swap(idx,i,nums);
     }

    }
    public static void swap(int i, int j, int [] num){
        int temp = num[i];
        num[i] = num[j];
        num[j]= temp;
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0, ans);
        return ans;
    }

    public static void main(String[] args) {
        int []a = {1,2,3};
        List<List<Integer>> ans =permute(a);
        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i) +" ");
        }
    }
}
