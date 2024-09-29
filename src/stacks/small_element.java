package stacks;
import java.util.*;
public class small_element {
    public static int [] nextSmall(int [] a){
        int n = a.length;
        int res[] = new int[n];
        Stack <Integer> st = new Stack<>();
        st.push(n-1);
        res[n-1] = -1;
        for(int i= n-2; i>=0; i--){
            while(!st.isEmpty() && a[i]<=a[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
                st.push(i);
            }
            else{
                res[i]=st.peek();
                st.push(i);
            }
        }
        return res;
    }
//    public static int [] prevSmall(int [] a){
//        int n = a.length;
//       int res []= new int[n];
//
//    }
    public static void main(String[] args) {
        int a [] = {1,5,3,2,1,6,3,4};
        int [] ans = nextSmall(a);
       // int [] p = prevSmall(a);
        for(int e:ans){
            System.out.print(e + " ");
        }
    }
}
