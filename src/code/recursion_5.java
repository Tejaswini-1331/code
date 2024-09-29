package code;

public class recursion_5 {
    static void array(int [] arr, int index){
        int n = arr.length;
       if( index==n) return;
        System.out.println(arr[index]);
        array(arr,index+1);
    }
    static int max_value(int [] arr, int index){
        if( index==arr.length-1) return arr[index];
        int small_ans = max_value(arr,index+1);
       return Math.max(arr[index],small_ans);
    }
    static int sum(int [] arr, int index){
        if( index==arr.length) return 0;
        int small_ans = sum(arr,index+1);
        return small_ans+= arr[index];
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,5,9};
        System.out.println(sum(arr,0));
    }
}
