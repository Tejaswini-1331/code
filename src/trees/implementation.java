package trees;

public class implementation {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node root){
       if(root == null) return;
        System.out.print(root.data+" -> ");
       if(root.left!=null) System.out.print(root.left.data+" ");
       else System.out.print("n"+" ");
        if(root.right!=null) System.out.print(root.right.data+" ");
        else System.out.print("n"+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    static int size(Node root){
        if(root == null) return 0;
        return size(root.left) + size(root.right)+1;
    }
    static int treeSum(Node root){
        if(root==null) return 0;
        return root.data + treeSum(root.left) + treeSum(root.right);
    }
    static int maxNode(Node root){
        if(root == null) return Integer.MIN_VALUE ;

        int max = Math.max(root.data,Math.max(maxNode(root.left),maxNode(root.right)));
        return max;
    }
    static int maxHeight(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        int max =  1+Math.max(maxHeight(root.left),maxHeight(root.right));
        return max;
    }
    public static void main(String[] args) {
      Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.left = b; a.right = c;

        Node d = new Node(40);
        Node e = new Node(5);
        b.left = d; b.right = e;

        Node f = new Node(6);
        c.right = f;
        display(a);
        System.out.println(maxHeight(a));

    }
}
