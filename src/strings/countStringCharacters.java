package strings;

public class countStringCharacters {
    public static void main(String [] args){
        String s = "teju teju";
        int count = 0;

        for(char ch: s.toCharArray()){
            if(ch != ' ') count++;
        }
        System.out.println(count);
    }
}
