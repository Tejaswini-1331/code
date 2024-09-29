package datastructures;

public class endNode {
    public static Node nthNode(Node head,int x){ //return node at x index
        int size=0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp = head;
        int m = size-x+1;
       for(int i = 1; i<m;i++ ){
           temp = temp.next;
       }
       return temp;
    }
    public static Node NthNode(Node head, int n){
        Node fast=head; Node slow =head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast ==null) {
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int size(Node head){
        Node temp=head; int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static Node intersection(Node head, Node head1){
        int m = size(head);
        int n = size(head1);
        Node temp = head;
        Node temp2 = head1;
        int a = Math.abs(m-n);

        for(int i=1;i<=a;i++){
            temp = temp.next;
        }

        while(temp!=null && temp2!=null){
            if(temp.data!=temp2.data){
                temp=temp.next;
                temp2=temp2.next;
            }
            else{
                return temp;
            }
        }
        return temp;
    }
    public static Node midElement(Node head) {
        Node slow = head;
        Node fast = head;
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size % 2 == 0) {
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        } else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }
    public static void main(String[] args) {
       Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next =f;
         display(a);
        Node a1 = new Node(9);
        Node b1 = new Node(5);
        Node c1 = new Node(12);


        a1.next=b1;
        b1.next=c1;

         display(a1);
        Node ans = midElement(a);
        System.out.println(ans .data);
        Node ans1 = midElement(a1);
        System.out.println(ans1 .data);
    }

}


