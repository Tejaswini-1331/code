package code;

public class binary_search2 {
     static int rotatedArrayMinimum(int [] a){
         int n =a.length;
         int start =0; int end = n-1; int ans =-1;
         while(start<=end){
             int mid = start+(end-start)/2;
             if(a[mid]<=a[n-1]){
                 ans = mid;
                 end = mid-1;
             }
             else{
                 start =mid+1;
             }
         }
         return ans;
     }
     static int targetSearch(int [] a, int target){
         int start =0; int end =a.length-1;
         while(start<=end){
             int mid = start+(end-start)/2;
             if(a[mid]==target)
                 return mid;

              else if(a[mid]<a[end]){ //if mid to end is sorted
                 if(a[mid]<target && target<=a[end]){
                     start = mid+1;
                 }
                 else{
                     end = mid-1;
                 }
             }
             else{  // if start to end is sorted
                 if(a[start]<=target && target <a[mid]){
                     end=mid-1;
                 }
                 else{
                     start = mid+1;
                 }
             }
         }
         return -1;
     }

    public static void main(String[] args) {
     int [] a ={3,1};
     int target = 1;
        System.out.println(targetSearch(a,target));
    }
}
