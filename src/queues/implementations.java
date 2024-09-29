package queues;

public class implementations {
    public static class queue {
        int[] arr = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;

        void add(int val) {
            if(r == arr.length-1) return;
            if(f==-1) {
                r = f = 0;
                arr[0] = val;
            }
            else{
                 arr[r+1]=val;
                 r = r+1;
            }
            size++;
        }
        int remove(){
            f++;
            return arr[f-1];
        }
        int peek(){
            return arr[f];
        }
        void display(){
            if(size==0) {System.out.println("empty"); return;}
            for(int i=f; i<=r; i++){
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
     queue q = new queue();
     q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);

     System.out.println(q.size);
     q.display();
    }
}
