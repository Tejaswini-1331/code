package datastructures;

public class evenOddLinkedList {
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data +" ");

            head = head.next;
        }
        System.out.println();
    }
    public static boolean iterative(Node head) {

            Node mid = null;
            Node fast =head;
            Node slow =head;

            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast=fast.next.next;
            }
            mid = slow;
             Node cur = mid.next;
             Node prev = null;
             Node n = null;
             while(cur!=null){
                 n=cur.next;
                 cur.next=prev;
                 prev = cur;
                 cur = n;
             }
            Node head2 = mid.next;
             while(head!=mid && head2!=null){
                 if(head.data==head2.data){
                     head=head.next;
                     head2=head2.next;
                 }
                 else{
                     return false;
                 }
             }
            return true;
        }
    public static Node copyRandomList(Node head) {
        Node temp = head;
        Node head2 = new Node(0);
        Node temp2 = head2;
        while(temp!=null){
            Node n = new Node(temp.data);
            temp =temp.next;
            temp2.next=n;
            temp2=temp2.next;
        }
        return head;
    }


    public static Node isReversed(Node head){
        if(head.next==null) return head;
        Node newhead = isReversed(head.next);
        head.next.next=head; //interchanging things;
        head.next=null;
        return newhead;
    }
    public static class Node{
        int data;
        Node next;
        Node(){};
        Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(1);
         Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        Node ans =copyRandomList(a);
        display(ans);

    }
}
