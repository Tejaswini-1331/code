package hashmap;
import java.util.*;
public class isomorphic_strings {
    public static boolean iso(String s,String t){
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0;i<t.length();i++){
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if(!mp.containsKey(sch) ){
                if (mp.containsValue(tch)) return false;
                mp.put(sch,tch);
            }
            else if(mp.containsKey(sch)){
                if(!mp.get(sch).equals(tch)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(iso(s,t));
    }
}
