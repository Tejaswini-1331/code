package stacks;

import java.util.Stack;

public class next_greater_element {
    public static int [] greater(int [] a){
        Stack<Integer> st = new Stack<>();
        int n = a.length;
        int [] res = new int[n];
        res[n-1] = -1;
        st.push(a[n-1]); // push last element so that we can compare with other elements
       // res[(res.length-1)]=-1;
        for(int i =n-2;i >=0;i--){
            while( !st.isEmpty() && a[i]>a[st.peek()] ){
                st.pop();
            }
            if(st.isEmpty()) {
                res[i]=-1;
                st.push(i);}

            else{
                res[i]=st.peek();
                st.push(i);
            }
        }
       return res;
    }
    public static void main(String[] args) {
        int a [] = {1,5,3,2,1,6,3,4};
        int [] ans = greater(a);
        for(int e:ans){
            System.out.print(e + " ");
        }
    }
}
