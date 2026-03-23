package FidelityAfter.InterviewPracticePrograms;

public class missingNumberInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6}; int n = arr.length + 1; // take length + 1

        int totalSum = n * (n+1)/2; int arrsum =0;
        for(int num: arr){
           arrsum += num;
            System.out.println(arrsum);
        }
        System.out.println(totalSum - arrsum);
    }
}
