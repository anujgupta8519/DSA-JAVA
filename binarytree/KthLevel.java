package binarytree;

public class KthLevel {
    public static void kthLevel(Node root,int curr, int k) {
    if (root==null) {
        return;
    }else if (curr==k) {
        System.out.print(root.data+" ");
    }else{
        kthLevel(root.left, curr+1, k);
        kthLevel(root.right, curr+1, k);
    }
        
    }
    public static void main(String[] args) {
        //     1
        //    / \
        //   2    3
        //  / \  / \
        // 4   5 6  7
    Node root = new Node(1);
    root.left = new Node(2);
    root.right=new Node(3);
    root.left.left = new Node(4);
    root.left.right=new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    kthLevel(root, 1, 1);
   
}
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}