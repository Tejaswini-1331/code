package datastructures;

public class basicsll {
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
     public static int length(Node head){

        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;
       Node(int data)
       {     //constructor
         this.data=data;
       }
    }

    public static void main(String[] args) {
       Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println(length(a));
    }
}
