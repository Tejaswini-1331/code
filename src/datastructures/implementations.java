package datastructures;

public class implementations {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head;
        Node tail;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }

        }

        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }

        }

        void insert(int idx, int val) {
            Node tempElement = new Node(val);
            Node temp = head;
            if (idx == 0) {
                insertAtBeginning(val);
                return;
            }
            else if(idx==size()){
                insertAtEnd(val);
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            tempElement.next = temp.next;
            temp.next = tempElement;

        }
        void deleteAtIndex(int idx){
            Node temp =head;
            if(idx==0) head =head.next;

            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size()) tail=temp;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
      linkedlist a = new linkedlist();
        a.insert(0,6);
        a.insert(1,5);
        a.insert(2,10);
        a.insert(3,15);
        a.deleteAtIndex(0);
        a.display();
        System.out.println(a.head.data);


    }
}
