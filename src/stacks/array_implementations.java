package stacks;

public class array_implementations {
    public static class Stacks {
        int[] arr = new int[6];
        int idx =0;
        void push(int x) {

            if (idx < arr.length) {
                arr[idx] = x;
                idx++;
            }
        }
        int peek(){
            if (idx==0) return -1;
            return arr[idx-1];
        }
        int pop(){
            if (idx==0) return -1;
            int top = arr[idx-1];
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stacks a= new Stacks();
        a.push(5);
        a.push(4);
        a.push(3);
        a.push(2);
        System.out.println(a.peek());
        a.display();
         a.pop();
    }
}
