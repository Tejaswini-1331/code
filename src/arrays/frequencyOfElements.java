package arrays;

import java.util.*;

public class frequencyOfElements {
    public static void main(String [] args){
        int [] arr = {1,4,5,6,7,8,7,6,7,8};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a: arr){
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        }

        System.out.println(map);
    }
}
