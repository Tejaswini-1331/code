package stacks;
import java.util.*;
public class remove_consecutive_subsequences {
    public static int [] remove(int [] a){
      Stack<Integer> st = new Stack<>();
      for(int i=0;i<a.length-1;i++){
        if(st.size()==0 || st.peek()!=a[i])
            st.push(a[i]);
        else if(st.peek()==a[i]){
            if(i==a.length-1 || a[i]!=a[i+1]) st.pop();
        }
      }
      int [] res = new int[st.size()]; //copying
      for(int i= res.length-1; i>=0;i--){
          res[i]=st.pop();
      }
      return res;
    }
    public static void main(String[] args) {
        int [] a ={1,2,2,3,10,10,10,4,4,5,7};

        int [] res = remove(a);
        for(int ans:res){
            System.out.print(ans +" ");
        }
    }
}
