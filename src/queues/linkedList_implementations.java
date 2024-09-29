package queues;

public class linkedList_implementations {
    public static class Node{
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    public static class queue {
     Node head =null;
    Node tail = null;
    int size =0;
    void add(int x){
        Node t = new Node(x);
        if(size==0){
            head=tail=t;
        }
        else{
            tail.next =t;
            tail =t;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        }
    }
    public static void main(String[] args) {
     queue t = new queue();
     t.add(1);  t.add(2);  t.add(3);  t.add(4);  t.add(5);  t.add(6);
        t.display();

    }
}
