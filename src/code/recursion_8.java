package code;
import java.util.*;
public class recursion_8 {
    static ArrayList<String> search(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        ArrayList<String> small_ans = search(s.substring(1));
        char current_element = s.charAt(0);
        for(String ss:small_ans){
            ans.add(ss);
            ans.add(current_element+ss);
        }
        return ans;
    }
    static void print(String s, String current){
        if(s.length()==0) {
            System.out.print(current+" ");
            return;
        }
            char current_char = s.charAt(0);
            String remaining = s.substring(1);
            print(remaining, current + current_char);
            print(remaining,current);
    }
    public static void main(String[] args) {
        System.out.println(search("abc"));
        print("abc","");
    }
}
