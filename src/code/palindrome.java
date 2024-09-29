package code;

public class palindrome {
    static boolean isPlaindrome(String s){
        int i=0;int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int count =0;
        String s = "aba";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+ " ");
                if(isPlaindrome(s.substring(i,j))==true){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
