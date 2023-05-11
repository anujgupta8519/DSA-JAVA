package binarytree;

public class Diameter {
    static class Info{
        int diaMet, height;
    }
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
    public static int  diameterTree(Node root) {
        if (root==null) {
            return 0;
        } else {
            int leftDia = diameterTree(root.left);
            int rightDia = diameterTree(root.right);
            int lh = heightOftheTree(root.left);
            int rh = heightOftheTree(root.right);
            int selfDia = lh+rh+1;
            return Math.max(rightDia,Math.max(leftDia, selfDia));
            
        }
        
        
    }
    public static Info diameterTree1(Node root ) {
        Info info = new Info();
        if (root==null) {
            info.diaMet =0;
            info.height=0;
            return info;
        }
        Info leftInfo = diameterTree1(root.left);
        Info rightInfo = diameterTree1(root.right);
        int self = leftInfo.height+rightInfo.height+1;
        info.diaMet = Math.max(self, Math.max(leftInfo.diaMet, rightInfo.diaMet));
        info.height=Math.max(leftInfo.height, rightInfo.height)+1;
        return info;
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right=new Node(3);
        root.left.left = new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //System.out.println(diameterTree(root));
        Info info = diameterTree1(root);
        System.out.println(info.diaMet);
        System.out.println(info.height);
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
