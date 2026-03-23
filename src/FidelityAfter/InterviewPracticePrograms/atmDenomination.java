package FidelityAfter.InterviewPracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class atmDenomination {
public static void main(String[] args) {
    int amount = 5100; int sumOfAmount = 0;
   HashMap<Integer, Integer> map = new HashMap<>();
//
//    while(amount != sumOfAmount){
//        int currSum = amount - sumOfAmount; // 2500 -  0  = 2500
//         if(currSum >= 2000){
//             sumOfAmount += 2000;
//             map.put(2000, map.getOrDefault(2000, 0)+1);
//         }
//         else if(currSum >= 500){
//             sumOfAmount += 500;
//            map.put(500, map.getOrDefault(500, 0)+1);
//         }
//         else if(currSum >= 200 ){
//             sumOfAmount += 200;
//             map.put(200, map.getOrDefault(200,0)+1);
//         }
//         else if(currSum >= 100 ) {
//             sumOfAmount += 100;
//             map.put(100, map.getOrDefault(100, 0)+1);
//         }
//    }
//    System.out.println(map);
//    for (Map.Entry<Integer,Integer> map1 : map.entrySet()){
//        System.out.println(map1.getKey() + " - " + map1.getValue());
//    }

    //method 2

    int [] notes = {2000, 500, 200, 100, 50}; int count = 0;

    for(int note: notes){
        count =  amount / note;
        map.put(note, count);
        amount = amount % note;
    }
    System.out.println(map);

  }
}
