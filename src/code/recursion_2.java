package code;

public class recursion_2 {
    static int sumOfDigits(int n){
        if(n>=0 && n<=9) return n;
        return sumOfDigits(n/10)+ n%10;
    }
    static int count(int n){
        if(n>=0 && n<=9) return 1;
        return count(n/10)+1;
    }
    static int powerOfDigit(int m, int n){
        if(n==0) return 1;
        if(n==1) return m;
        return powerOfDigit(m,n-1) * m;
    }
    static int pow(int m, int n){
        if(n==0) return 1;
        int smallans=pow(m,n/2);
        if(n%2==0) {
            return smallans * smallans;
        }
            return smallans * smallans * m;

    }
    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
