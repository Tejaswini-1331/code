package stacks;

import java.util.Stack;
public class basics {
    public static void displayReverse(Stack<Integer> a){
        if(a.size()==0) return;
        int top =a.pop();
       // System.out.print(top+" ");
        displayReverse(a);
        System.out.print(top+" ");
        a.push(top);
    }
    public static void pushAtEnd(Stack<Integer> a, int x) {
        if (a.size() == 0) {
            a.push(x);
            return;
        }
        int top=a.pop();
        pushAtEnd(a, x);
        a.push(top);
    }

    public static void Reverse(Stack<Integer> a) {
        if(a.size()==1) return ;
        int top=a.pop();
        Reverse(a);
        pushAtEnd(a,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
//        int index = 5;
//        int x = 5;
//        while (st.size() > index-1) {
//            gt.push(st.pop());
//        }
//
//        st.push(x);
//        while (gt.size() > 0) {
//            st.push(gt.pop());
//        }
//        System.out.println(st);
//        int n = st.size();
//        int [] arr = new int[n];
//        for(int i =n-1;i>=0;i--){
//            int g =st.pop();
//            arr[i]=g;
//        }
//        for(int ans:arr) {
//            System.out.print(ans +" ");
//        }

        System.out.println(st);

    }
}
