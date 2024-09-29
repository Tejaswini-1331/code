package code;

public class binary_search {
    static int target_return(int [] a, int target,int start,int end){
       while(start<=end) {
           int mid = (start + end) / 2;
           if (a[mid] == target) return mid;
           else if (a[mid] < target) {
               start = mid + 1;
           } else {
               end = mid - 1;
           }
       }
        return -1;
    }
    static boolean target2(int [] a, int target,int start,int end){
        if(start>end) return false;
        int mid = (start + end) / 2;
        if (a[mid] == target) return true;
        else if(a[mid]<target) return target2(a, target, mid+1, end);
        else return target2(a, target, start, mid-1);
    }
    static int first_occurrence(int[] a,int target, int start,int end){
        int first =-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==target){
                first = mid;
                end = mid-1;
            }
            else if(a[mid]<target){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }

        }
        return first;
    }
    static int square_root(int x){
        int ans =-1;
        int start =0; int end = x;
        while(start <= end){
            int mid = start + (end-start)/2;
            int value = mid*mid;
            if(x==value){
                return mid;
            }
            else if(value>x){
                end = mid-1;
            }
            else{
                ans=mid;
                start = mid+1;
            }
        }
        return ans;
    }
    static int last_occurrence(int [] a, int target,int start, int end){
        int last=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid] == target) {
                last = mid;
                start = mid+1;
            }
            else if(a[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        float a = 2.3334f;
        System.out.println(a*a);
    }
}
