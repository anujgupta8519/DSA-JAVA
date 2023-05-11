public class ProblemTwentyTwo {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data= data;
            left=null;
            right=null;
        }
        Node(){

        }
    }
    public static boolean getMaxSum(Node root, int sum) {
        if(root==null||root.data==0){
            return false;
        }
        // int lf = getMaxSum(root.left);
        // int ri = getMaxSum(root.right);
        // return Math.max(lf, ri)+root.data;
        boolean isTrue = false;
        int nodeSum = sum-root.data;
        if (nodeSum == 0 && root.left == null && root.right == null){
             isTrue = true;
            return isTrue;

        }
       
    if (root.left != null){
        isTrue = isTrue||getMaxSum(root.left, nodeSum);
    } 
      if (root.right!=null) {
        isTrue = isTrue||getMaxSum(root.right, nodeSum);
    }

      return isTrue;
        
    } 

    public static void main(String[] args) {
        //first test case
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        System.out.println(getMaxSum(root, 22));
        //second test case
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        System.out.println(getMaxSum(root1, 4));
        //third test case
        Node root2 = new Node();
        System.out.println(getMaxSum(root2, 0));



    }
}
