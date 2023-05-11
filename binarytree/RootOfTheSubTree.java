package binarytree;

public class RootOfTheSubTree {
    public static boolean isIdentiacl(Node node, Node root) {
        if (node==null&&root==null) {
            return true;
        }else if (node==null||root==null||node.data!=root.data) {
            return false;
        }
        if (!isIdentiacl(node.left, root.left)) {
            return false;
        }
        if (!isIdentiacl(node.right, root.right)) {
            return false;
        }
        return true;
        
    }
    public static boolean isSubTree(Node root, Node subNode ) {
        if (root==null) {
            return false;
        }else if (root.data == subNode.data) {
            if (isIdentiacl(root,subNode)) {
                return true;
            }
             
          
            
        }
        return isSubTree(root.left, subNode)||isSubTree(root.right, subNode);
   
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right=new Node(3);
        root.left.left = new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        

        Node subNode = new Node(2);
        subNode.left = new Node(4);
        subNode.right=new Node(5);
        System.out.println(isSubTree(root, subNode));
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