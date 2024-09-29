package hashmap;

public class twoSum {
    public static int [] sum(int [] a, int target){
        int [] ans = {-1};
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1; j<a.length; j++){
                int n1 = a[i];
                int n2 = target - n1;
                if(a[j]==n2){
                   ans = new int[]{i,j};
                   return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a ={1,5,7,-1};
        int [] ans = sum(a,6);
        for(var e:ans){
            System.out.print(e+" ");
        }
    }
}
