package FidelityAfter.InterviewPracticePrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nonRepeatedNumbers {
    public static void main(String[] args) {
        int [] a = {1,1,2,2,3,4,5,5};
        HashMap<Integer, Integer> countMap= new HashMap<>();
        for(int num:a){
            if(!countMap.containsKey(num)) {
                countMap.put(num,1);
            }
            else{
                countMap.put(num,countMap.get(num) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,Integer> map: countMap.entrySet()){
            if(map.getValue()==1) ans.add(map.getKey());
        }

        System.out.println(ans);
    }
}
