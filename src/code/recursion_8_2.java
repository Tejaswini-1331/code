package code;

public class recursion_8_2 {
    static void arr(int [] arr, int idx, int sum){
        if(idx>=arr.length){
            System.out.print(sum + " ");
            return;
        }
        arr(arr,idx+1,sum+arr[idx]);
        arr(arr,idx+1,sum);
    }
    static void combination(String s, String [] kp, String res){
        if(s.length()==0){
            System.out.print(res +" ");
            return;
        }
        int currentNumber = s.charAt(0)-'0';
        String currentChoice =kp[currentNumber];
        for(int i=0;i<currentChoice.length();i++){
            combination(s.substring(1),kp,res+currentChoice.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "22";
     String [] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     combination(s,kp,"");
    }
}
