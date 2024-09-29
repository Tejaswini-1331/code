package hashmap;
import java.util.*;
public class age {
    public static void main(String[] args) {
        Map<Integer, Integer> fre = new HashMap<>();
        int [] a ={1,2,3,1,2,1,1,1}; int max=0; int ansKey=-1;
        for(int e: a){
            if(!fre.containsKey(e)) fre.put(e,1);
            else fre.put(e,fre.get(e)+1);
        }
        for(var i: fre.entrySet()){
          if(i.getValue()>max){
              max = i.getValue();
              ansKey = i.getKey();
          }
        }
        System.out.println(ansKey);
    }
}
