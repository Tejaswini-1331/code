package stacks;

public class likedlist_stacks_implementation {
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public  static class ll{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }

            System.out.println();
        }
        int pop(){
            int top = head.data;
            head = head.next;
          return top;
        }
        int peek(){
          return head.data;
        }
    }
    public static void main(String[] args) {
        ll a = new ll();
    a.push(5);
    a.push(4);
    a.push(3);
    a.push(2);
    a.push(1);
    System.out.println(a.pop());
    a.display();

    System.out.println( a.peek());


    }
}
