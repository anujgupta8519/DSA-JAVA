package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class AllOrder {

    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root= bt.builtTree(nodes);
        //System.out.println(root.data+" "+root.left.data+" "+root.right.data);
        bt.preOrderTraversal(root);
        System.out.println();
        bt.inOrderTraversal(root);
        System.out.println();
        bt.postOrderTraversal(root);
        bt.levelOrderTraversal(root);
   

    }
    
}
class BinaryTree{
    int inx =-1;
    public Node builtTree(int nodes[]) {
        inx++;
       if (nodes[inx]==-1) {
        return null;
       }       
       Node newNode = new Node(nodes[inx]);
       newNode.left=builtTree(nodes);
       newNode.right=builtTree(nodes);
       return newNode;
    }
    public void preOrderTraversal(Node root) {
        if (root==null) {
            System.out.print(-1+" ");
            return;
            
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        
    }
    public void inOrderTraversal(Node root) {
        if (root==null) {
            //System.out.print(-1+" ");
            return;
            
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
        
    }
    public void postOrderTraversal(Node root) {
        if (root==null) {
            //System.out.print(-1+" ");
            return;
            
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
        
    }
    public void levelOrderTraversal(Node root) {
        int level=0;
        if (root==null) {
            System.out.println("Empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        level++;
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    level++;
                    q.add(null);
                }
                
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left!=null) {
                    q.add(currNode.left);
                   
                    
                }
                if (currNode.right!=null) {
                    q.add(currNode.right);
                }

            }
        }
        System.out.println(level);
        
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