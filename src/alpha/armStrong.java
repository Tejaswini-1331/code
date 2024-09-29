package alpha;

public class armStrong {
    public static int count(int n){
        int co =0;
        while(n>0){
            n=n/10;
            co++;
        }
        return co;
    }
    public static int lastDigit(int n){
        int ans;
        ans = n%10;
        return ans;
    }
    public static int expo(int number, int count){
        int ans=1;
        for(int i=0; i<count; i++){
            ans = ans*number;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 371; int ans =0; int c = n;
        int count = count(n);
        while(n>0){
          int last = lastDigit(n);
          int expo = expo(last,count);
          System.out.println(last+"  "+expo);
          ans = ans+expo;
          n=n/10;

        }
        if(ans==c) System.out.println("yes");
        else System.out.println("no");
    }
}
