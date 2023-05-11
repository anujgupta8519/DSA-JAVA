package binarsearchtree;

public class Built {
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
    public static boolean search(Node root, int key) {
        if (root==null) {
         return false;   
        }
        if (root.data==key) {
            return true;
        }else if (root.data>key) {
            return search(root.left, key);
        }else if (root.data<key) {
            return search(root.right, key);
        }else{
            return false;
        }
    }
    public static Node delete(Node root, int key) {
         if (root.data>key) {
               root.left= delete(root.left, key);
           }else if (root.data<key) {
               root.right= delete(root.right, key);
           }else{
            if (root.left==null&&root.right==null) {
                return null;
            }else if (root.left==null) {
                return root.right;
            }else if (root.right==null) {
                 return root.left;
            }else{
                Node is = inorderSuccesser(root.right);
                root.data = is.data;
                root.right =delete(root.right, is.data);
            }
           }
           return root;
        
    }
       public static Node inorderSuccesser(Node node){
        while (node.left!=null) {
            node=node.left;
        }
        return node;
       }
       public static void printInaRange(Node root, int r1, int r2) {
        if (root==null) {
            return;
        }else if (root.data>=r1&&root.data<=r2){
            printInaRange(root.left, r1, r2);
            System.out.print(root.data+" ");
            printInaRange(root.right, r1, r2);
        }else{
        if (root.data<r1) {
            printInaRange(root.left, r1, r2);
        }else{
            printInaRange(root.right, r1, r2);  
        }}
        
       }
    public static void main(String[] args) {
        int value[] = {8,5,10,3,6,11,1,4,14};
       Node root= built(value);
       inorder(root);
      // System.out.println(search(root, 14));
    //   delete(root, 8);
    //   System.out.println();
    //   inorder(root);
    System.out.println();
    printInaRange(root, 5, 11);
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
