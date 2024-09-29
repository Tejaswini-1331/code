package datastructures;

public class doubly_linled_lis {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){     //constructor
            this.data=data;
        }
    }
   public static void display(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
       }
       System.out.println();
   }
   public static void Insert(Node head, int x, int index){
        Node  temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node t = new Node(x);
        t.next = temp.next;
        temp.next.prev=t;
        temp.next=t;
        t.prev=temp;
   }
   public static boolean targetSum(Node head, int target){
        Node h =head;
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        while(h.data<t.data){
            if(h.data+t.data==target) return true;
            if(h.data+t.data>target) t=t.prev;
            else h=h.next;
        }
        return false;
   }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
       Node e = new  Node(5);
        a.next=b;
        b.prev = a;
        b.next=c;
        c.prev =b;
        c.next=d;
        d.prev = c;
        d.next=e;
        e.prev=d;
        display(a);
        System.out.println(targetSum(a,48));
    }

}
