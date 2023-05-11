package binarsearchtree;

import java.util.ArrayList;

public class RootToLeafPath {
    public static Node helper(Node root, int val) {
        if (root==null) {
            root = new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left = helper(root.left, val);
        }
        if (root.data<val) {
            root.right = helper(root.right, val);
        }
        return root;
        
    }
    public static Node built(int val[]) {
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root= helper(root, val[i]);
        }
        return root;
        
    }
    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null&&root.right==null) {
            System.out.println(path);
        }   
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
            path.remove(path.size()-1);
        
    }
    public static void inorder(Node root) {
        if (root ==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean isValid(Node root, Node min, Node max) {
        if (root==null) {
            return true;
        }
        if (min!=null && root.data<=min.data) {
            return false;
        }else if (max!=null&&root.data>=max.data) {
            return false;
        }
        return isValid(root.left, min, root)&&isValid(root.right, root, max);
        
    }
    public static Node mirror(Node root) {
     if (root==null) {
        return null;
     }else {
        //My Code
    //    mirror(root.left);
    //    mirror(root.right);
    //    Node temp = root.left;
    //    root.left = root.right;
    //    root.right= temp;
    //mam Code
    Node left = mirror(root.left);
    Node right = mirror(root.right);
    root.right = left;
    root.left = right;
    return root;
    }
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root= built(value);
        inorder(root);
        System.out.println();
        mirror(root);
        inorder(root);
        // ArrayList<Integer> al = new ArrayList<>();
        // rootToLeaf(root, al);
        // System.out.println(isValid(root, null, null));

    }
}
class Node {
    int data;
    Node left,right;
    Node(int data){
    this.data = data;
    this.left=this.right = null;
  
    }
      
  }
