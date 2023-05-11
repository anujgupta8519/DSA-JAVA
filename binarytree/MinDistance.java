package binarytree;

public class MinDistance {
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
    public static int dist(Node node, int l) {
        if (node==null) {
            return -1;
        }
        if (node.data==l) {
            return 0;
        }
        int left = dist(node.left, l);
        int right = dist(node.right, l);
        if (left==-1&&right==-1) {
            return -1;
        }
        if (left==-1) {
            return right+1;
        }else{
             return left+1;
        }
        
    }
    public static int minDistance(Node root, int l1, int l2) {
        Node lca = lca1(root, l1, l2);
        int dist1 = dist(lca,l1);
        int dist2 = dist(lca, l2);
        return dist1+dist2;
        
    }
    public static int kthAncector(Node root, int n , int k) {
     if (root==null) {
        return -1;
     }
     if (root.data==n) {
        return 0;

     }
     int left = kthAncector(root.left, n, k);
     int right = kthAncector(root.right, n, k) ;
     if (left==-1&&right==-1) {
        return -1;
     }
      int max = Math.max(left, right);
      if (max+1==k) {
        System.out.println(root.data);
      } 
      return max+1;  
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
   // System.out.println(minDistance(root, 4, 6));
   kthAncector(root, 5, 2);
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
