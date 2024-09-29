package code;

public class recursion_followup {
    static boolean isSorted(int [] arr, int index){
        if(index==arr.length-1) return true;
        if(arr[index]>arr[index+1]) return false;
        return isSorted(arr,index+1);
    }
    static int lastIndex(int [] arr, int target, int index){
        if(index<=0)  return -1;
        if(arr[index]==target) return index;
        return lastIndex(arr,target,index-1);
    }
    static int[] twoSum(int[] arr, int target) {
        int [] result = new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                 result[0]=i;
                 result[1]=j;
                 return result;
                }
            }
        }
       return new int [0];
    }

    public static void main(String[] args) {
     int [] a = {9,2,3,4,5,4,5};
        int [] res =twoSum(a,5);
        System.out.println(twoSum(a,5));
    }
}
