package binarytree;

import java.util.ArrayList;

public class LowestCommenAncecter {
    public static boolean path(Node node, int l, ArrayList<Node> path) {
        if (node==null) {
            return false;
        
        }
        path.add(node);
        if (node.data ==l) {
            return true;
        }
        boolean left = path(node.left, l, path);
        boolean right = path(node.right, l, path);
        if (right||left) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
        
    }
    public static Node lca(Node root, int l1, int l2) {
     ArrayList<Node> al1 = new ArrayList<>();
     ArrayList<Node> al2 = new ArrayList<>();
     path(root, l1, al1);
     path(root, l2, al2);
     int i =0;
     for (; i < al1.size()&&i<al2.size(); i++) {
        if (al1.get(i)!=al2.get(i)) {
            break;
        }
     }
    return al1.get(i-1);
    }
    public static Node lca1(Node root, int l1, int l2) {
        if (root==null||root.data==l1||root.data==l2) {
            return root;
        }
        Node left = lca1(root.left, l1, l2);
        Node right = lca1(root.right, l1, l2);
        if (left==null) {
            return right;
        }
        if (right==null) {
            return left;
        }
        return root;
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
    System.out.println(lca1(root, 4, 5).data);
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
