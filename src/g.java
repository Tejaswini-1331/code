


import java.util.ArrayList;

public class g {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; i++) {
                sum = sum + arr[j];
                System.out.println(sum);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,7,5};
        subarraySum(arr, 5,12);
    }
}
