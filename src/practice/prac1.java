package practice;

public class prac1 {
    public static void main(String[] args) {
        String s = " hello teju - 5665420";
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                count++;
            }
        }
        System.out.println(count);
    }
}
