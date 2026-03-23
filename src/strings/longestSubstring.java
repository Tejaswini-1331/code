package strings;

import java.util.ArrayList;
import java.util.List;

public class longestSubstring {



    public static int substringCount(String s){
        int max_length = 0;
        int start =0 , end = 0;

        List<Character> list = new ArrayList<Character>();

        while(end<s.length()){

            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());

            }
            else{
                 list.remove(Character.valueOf(s.charAt(start)));
                 start++;
            }
        }


        return max_length;
    }
    public static void main(String [] args){
        System.out.println(substringCount("abcbac"));
        int [] a = new int[4];

        longestSubstring l = new longestSubstring();

    }
}
