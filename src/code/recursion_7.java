package code;

public class recursion_7 {
    static String remove(String s, int index) {
        if (index == s.length()) return "";
        String small_ans = remove(s, index + 1);
        char current = s.charAt(index);
        if (current != 'a') {
            return current + small_ans;
        } else {
            return small_ans;
        }
    }
        static void reverse(String s, int index){
            if(index==s.length()) return;
            reverse(s,index+1);
            System.out.print(s.charAt(index) + " ");

    }
    static String reverse2(String s, int index){
        if(index==s.length()) return "";
        String  small_ans =reverse2(s,index+1);
        char current = s.charAt(index);
        return small_ans + current;
    }
    static boolean palindrome(String s, int first, int last){
        if(first>=last) return true;
        if(s.charAt(first)!=s.charAt(last)) return false;
        return palindrome(s,first+1,last-1);

    }
    public static void main(String[] args) {
        String s = "dad";
        System.out.println(palindrome(s,0,s.length()-1));

    }

}
