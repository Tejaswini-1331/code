package alpha;

public class palindrome_numbers {
    public static void main(String[] args) {
        int n = 1232; int check=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            System.out.println(rev);
            n=n/10;
        }
        if(check==rev) System.out.println("palindrome");
        else System.out.println("no");
    }
}
