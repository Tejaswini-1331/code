package FidelityAfter.InterviewPracticePrograms;

public class minimunAndMaximum {
    public static void main(String[] args) {
        int [] arr = {7,3,2,7,8,9,1,5};
        int min = Integer.MAX_VALUE; int max =0;

        for(int num: arr){
            min = Math.min(num,min);
            max = Math.max(max, num);
        }

        System.out.println(min +" "+ max);
    }
}
