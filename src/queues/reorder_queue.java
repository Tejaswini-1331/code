package queues;
import java.util.*;
public class reorder_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);q.add(8);
        int n = q.size()/2;
        System.out.println(q);
        //1st half in stack
        for(int i=1;i<=n;i++){
            st.push(q.remove());
        }
        //5 6 7 8


        while(!st.isEmpty()){
            q.add(st.pop());
        }
        // 5 6 7 8 4 3 2 1
        for(int i= 1;i<=n;i++){
            st.push(q.remove());

        }

        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        // 8 4 7 3 6 2 5 1
        // reverse this queue by putting to stack
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);

    }
}
