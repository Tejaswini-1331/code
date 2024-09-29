package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class circularQueue {
    public static class circular{


        int [] a = new int [5];
        int r =-1;
        int f=-1;
         int size=0;

        public void add(int val) throws Exception{
            if (size == a.length) {
                throw new Exception("queue full");
            }
            else if(f==-1 && r==-1) {
                a[r+1] = val;
                f=r=r+1;
            }
            else if(r<a.length-1){
                a[r+1] = val;
                r=r+1;
            }
            else if(r==a.length-1){
                a[0] =val;
                r=0;
            }
            size++;
        }
        void display(){
            if(size < a.length)  {
                System.out.println("queue full");
                return;}
            if(r>=f){
                for(int i =f; i<=r; i++){
                    System.out.print(a[i] +" ");
                }
                System.out.println();
            }
            else if(r<f){
                for(int i =f; i<=a.length-1; i++){
                    System.out.print(a[i] +" ");
                }
                for(int i =0; i<=r; i++){
                    System.out.print(a[i] +" ");
                }
                System.out.println();
            }
        }
        void remove(){
            if(size ==0) return ;
            if(f<a.length-1) f++;
            else if(f==a.length-1) f=0;
            size--;
        }
        int peek(){
         if(size==0) return -1;
         return a[f];
        }

    }
    public static void main(String[] args) throws Exception {
    circular q = new circular();
    q.add(1); q.add(2); q.add(3); q.add(4);
    q.add(9);
    q.display();
    System.out.println(q.peek());

    }
}
