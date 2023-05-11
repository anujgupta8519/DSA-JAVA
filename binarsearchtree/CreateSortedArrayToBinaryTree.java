package binarsearchtree;

import java.util.ArrayList;

public class CreateSortedArrayToBinaryTree {
    public static Node createTree(int arr[], int st, int ed) {
        if (st>ed) {
            return null;
        }
            int mid = (st+ed)/2;
            Node root = new Node(arr[mid]);
            root.left = createTree(arr, st, mid-1);
            root.right = createTree(arr, mid+1, ed);
            return root;

        
    }
    public static void preorder(Node root) {
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    public static Node createBT(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        //System.out.println(al);
        helper1(root, al);
        //System.out.println(al);
        int arr[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return createTree(arr, 0, arr.length-1);


        
    }
    public static void helper1(Node root,ArrayList<Integer> al ) {
        if (root==null) {
            return;
        }
        helper1(root.left, al);
        al.add(root.data);
        helper1(root.right, al);
        
    }
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
    public static void inorder(Node root) {
        if (root ==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {8,6,10,5,11,3,12};
        Node root = built(arr);
        preorder(root);
        root = createBT(root);
        System.out.println();
        preorder(root);
        System.out.println();
        inorder(root);

    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        this.left=this.right=null;
    }
}
