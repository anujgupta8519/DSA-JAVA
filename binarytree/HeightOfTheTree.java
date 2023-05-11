package binarytree;

public class HeightOfTheTree {
    public static int heightOftheTree(Node root) {
        if (root==null) {
            return 0;
        }else{
           int left= heightOftheTree(root.left);
           int right = heightOftheTree(root.right);
           int max = Math.max(left, right);
            return max+1;
        }
        
    }
    public static int countOfTheNode(Node root) {
        if (root==null) {
            return 0;
        }else{
           int left= countOfTheNode(root.left);
           int right = countOfTheNode(root.right);
 
            return left+right+1;
        }
        
    }
    public static int sumOfTheNode(Node root) {
        if (root==null) {
            return 0;
        }else{
           int left= sumOfTheNode(root.left);
           int right = sumOfTheNode(root.right);
              
            return root.data+left+right;
        }
    
}
public static void main(String[] args) {
    
    Node root = new Node(1);
    root.left = new Node(2);
    root.right=new Node(3);
    root.left.left = new Node(4);
    root.left.right=new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println(heightOftheTree(root));
    System.out.println(countOfTheNode(root));
    System.out.println(sumOfTheNode(root));
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
