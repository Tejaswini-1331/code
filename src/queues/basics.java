package queues;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
//        while(!q.isEmpty()){
//            System.out.print(q.peek() +" ");
//           q1.add(q.remove());
//
//        }
//        System.out.println(q1);

        System.out.println(q.remove());
    }
}
