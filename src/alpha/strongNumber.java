package alpha;

public class strongNumber {
    public static int lastDigit(int n){
        int ans;
        ans = n%10;
        return ans;
    }
    public static int fact(int n){
      int ans=1;
      while(n>0){
          ans = ans*n;
          n--;
      }
      return ans;
    }
    public static void main(String[] args) {
        int n = 145;
        int copy = n; int ans=0;
        while(n>0){
            int digit = lastDigit(n);
            int factorial = fact(digit);
            ans = ans + factorial;
            n = n/10;
        }
        if(copy==ans) System.out.println("yes");
        else System.out.println("no");
    }
}
