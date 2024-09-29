package code;

public class remove_duplicates {
    static int addDigits(int num) {
        if(num==0) return 0;
        if(num%9==0) return 9;
        return(num%9);
}
   static void removeZeros(int [] nums){
       int count =0;
       for(int i =0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[count++]=nums[i];
           }
        }
       while(count<nums.length){
           nums[count++]=0;
       }

   }
   static boolean twoPower(int n) {
       if (n == 0) return false;
       int rem =0;
      while(n!=1) {
          if(n%2!=0){
              return false;
          }
          else{
              n=n/2;
          }
      }
      return true;
   }


    public static void main(String[] args) {
          StringBuilder s = new StringBuilder("teju");
          s.reverse();
        System.out.println(s);

    }
}
