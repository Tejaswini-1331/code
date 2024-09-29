package code;

public class binary_search3 {
    static int twoDArray(int [][] a, int target){
        int n= a.length;/* row*/ int m = a[0].length;//column
        int start = 0; int end = n*m-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(a[mid/m][mid%m]==target) return mid;
            else if(a[mid/m][mid%m]>target){
                end= mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static boolean twoDArray2(int [][] a, int target) {
        int n=a.length; int m = a[0].length;//length of column
    int i=0; int j= m-1;
    while(i<n  && j>=0){
        if(a[i][j]==target) return true;
        else if(target<a[i][j]){
            j--;
        }
        else{
            i++;
        }
    }
    return false;
    }
    static int findPeakElement(int[] nums) {
        int start =0; int end = nums.length-1; int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                ans = mid+1;
                start =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
     int [] a ={1,2,3,4,5,4,3,2,11};
        System.out.println(findPeakElement(a));
    }
}
