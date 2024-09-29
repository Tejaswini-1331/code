package code;

public class leet_code {
    static boolean isPalindrome(int num) {
        int x = num;
        int sum =0;
        while(x!=0){
            sum = sum*10 + x%10;
            x= x/10;
        }
        if(num==sum){
            return true;
        }
        return false;

    }
    static boolean Palindrome(int x) {
        if(x<0) return false;
        int num = x;
        int sum =0;
        while(num!=0){
            sum = sum*10 + num%10;
            num= num/10;
        }
        return(x==sum);
    }


    public static void main(String[] args) {
        int x= (12321);
        System.out.println(Palindrome(x));
    }
}
