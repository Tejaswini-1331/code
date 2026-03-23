package alpha;


public class string {

    public static int convert(String s){
        int num =0;

        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            int tempNum = ch - 0;
            System.out.println(tempNum);
            num = num * 10 + tempNum;
        }

        return num;
    }

    public static String addStrings(String num1, String num2) {
        int number1 =0; int number2 =0;
        number1 = convert(num1);
        number2 = convert(num2);
        int sum = number1 + number2;
        //System.out.println(number1+ " " +number2);
        return String.valueOf(sum);
    }
    public static void main(String[] args){
        String s = addStrings("11","11");
        System.out.println(s);

    }
}