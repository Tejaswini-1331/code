package FidelityAfter;

import hashmap.HashmapImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram {
    public static HashMap<Character, Integer> map(String s){
        HashMap<Character,Integer> m = new HashMap<>();

        for(int i =0; i< s.length(); i++){
            Character ch = s.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+ 1);
            }
            else{
                m.put(ch,1);
            }
        }
    return m;
    }
    
    public static  boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        else {
            HashMap<Character, Integer> m = map(s1);
            HashMap<Character, Integer> n = map(s2);
            return m.equals(n);
        }
    }
    public static void main(String [] args){
        Scanner string1 = new Scanner(System.in);
        String s = string1.next();

        Scanner string2 = new Scanner(System.in);
        String s2 = string2.next();

        System.out.println(isAnagram(s,s2));

    }
}
