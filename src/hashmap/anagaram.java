package hashmap;

import java.util.*;

public class anagaram {
    public static HashMap<Character,Integer> keyset(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            int fre = mp.get(ch);

            if(mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),fre+1);
            else mp.put(s.charAt(i),1);
        }
        return mp;
    }

    public static boolean anagram(String s, String t){
        if(s.length()!= t.length()) return false;
        HashMap<Character,Integer> mp1 = keyset(s);
        HashMap<Character,Integer> mp2 = keyset(t);
        if(mp1.equals(mp2)) return true;
        return false;
    }


    public static boolean anagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = keyset(s);
        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(!mp1.containsKey(ch)) return false;
            int freq = mp1.get(ch);
            mp1.put(ch,freq-1);
        }
       for(Integer e:mp1.values()){   //values must be 0
           if(e!=0) return false;
       }
        return true;
    }
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(anagram(s,t));

    }
}
