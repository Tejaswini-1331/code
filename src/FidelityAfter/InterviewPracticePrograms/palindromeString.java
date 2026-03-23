package FidelityAfter.InterviewPracticePrograms;

public class palindromeString {
     public static int reverseNumber(int num){
         int rev =0;

         while(num>0){
             rev = rev*10 + num%10;
             num = num/10;
         }
         return rev;
     }

     public static String reverseString(String s){
         String rev = "";
         for(int i=0; i<s.length(); i++) {
             rev =  s.charAt(i) +rev;
         }
         return rev;
     }
    public static void main(String[] args) {
//       String s = "teju";
//       String rev = reverseString(s);
//        System.out.println(s.equals(rev));

//        int num = 12321;
//        int num2 = reverseNumber(num);
//        System.out.println(num2);
//        System.out.println(num==num2);

        String teju = "Teju is a good girl";
        System.out.println(teju.replaceAll("\\s",""));
    }
}
