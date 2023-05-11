package binarsearchtree;

public class LargestBSTinBinaryTree {
    static  int maxvalue=0;
    static  int maxvalue1=0;
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
         public Info() {
        }
        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root==null) {
            return true;
        }else{
        if (min!=null&& root.data<=min.data || max!=null&&root.data>=max.data) {
            return false;
        }
        return isValidBST(root.left, min, root)&&isValidBST(root.right, root, max);
    }
    }
    //O(n^2)
    public static Info getLargestBST(Node root) {
        if (root==null) {
            Info re = new Info();
            re.isBST = true;
            re.max= Integer.MIN_VALUE;
            re.min = Integer.MAX_VALUE;
            re.size =0;
            return re ;
        }else{
            Info rootLeft = getLargestBST(root.left);
            Info rootRight = getLargestBST(root.right);
            Info self = new Info();
            self.isBST = isValidBST(root, null, null);
            self.size = rootLeft.size+rootRight.size+1;
            self.min = Math.min(rootLeft.min, Math.min(rootRight.min, root.data));
            self.max = Math.max(rootLeft.max, Math.max(rootRight.max, root.data));
            if (self.isBST==true) {
                maxvalue = Math.max(maxvalue, self.size);
            }
            return self;
        }
        
    }
    public static Info largestBST(Node root) {
        if (root ==null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }else{
            Info leftInfo = largestBST(root.left);
            Info rightInfo = largestBST(root.right);
            int size = leftInfo.size+rightInfo.size+1;
            int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
            int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
            if (root.data<=leftInfo.max||root.data>=rightInfo.min) {
                return new Info(false, size, min, max);
            }
            if (rightInfo.isBST&&leftInfo.isBST) {
                maxvalue1 = Math.max(maxvalue1, size);
                return new Info(true, size, min, max);
            }
            return new Info(false, size, min, max);
        }

    }
    public static void inorder() {
        
    }
    public static void main(String[] args) {
      Node root = new Node(50);
      root.left=new Node(30);
      root.left.left = new Node(5);
      root.left.right = new Node(20);
      root.right= new Node(60);
      root.right.left= new Node(45);
      root.right.right= new Node(70);
      root.right.right.left= new Node(65);
      root.right.right.right= new Node(80);
      Info s = getLargestBST(root);
      System.out.println(maxvalue);
      System.out.println(s.size+" "+s.max+" "+s.min+" "+s.isBST);
      Info y = largestBST(root);
      System.out.println(maxvalue1);
      System.out.println(y.size+" "+y.max+" "+y.min+" "+y.isBST);

     
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data ){
        this.data = data;
        this.left=this.right= null;
    }
}
