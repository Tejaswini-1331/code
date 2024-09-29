package queues;

import java.util.LinkedList;
import java.util.Queue;

public class lik {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
