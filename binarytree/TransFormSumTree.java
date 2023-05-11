package binarytree;

import java.util.*;

public class TransFormSumTree {
    public static int transformSumTree(Node root) {
        if (root==null) {
            return 0;
            
        }
        int left = transformSumTree(root.left);
        int right = transformSumTree(root.right);
        int r = root.data;
        //My code
        // root.data = left+right;

        //   return r+left+right ;
        //mam code
        int leftdata = root.left ==null?0:root.left.data;
        int rightdata = root.right ==null?0:root.right.data;
        root.data = leftdata+left+rightdata+right;
        return r;
        
    }
    public static void levelOrderTraversal(Node root) {
        if (root==null) {
            System.out.println("Empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
            
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
        //System.out.println(level);
        
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
    transformSumTree(root);
    levelOrderTraversal(root);
    
  
    }
}class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

