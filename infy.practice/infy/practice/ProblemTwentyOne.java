public class ProblemTwentyOne {
    static class Node{
        int root;
        Node left, right;
        public Node(int root) {
            this.root = root;
            this.left=null;
            this.right = null;
        }

    }
    public static int maximumDepthOfTree(Node root) {
        if (root==null) {
            return 0;
        }
        int lh = maximumDepthOfTree(root.left);
        int rh = maximumDepthOfTree(root.right);
        return Math.max(lh, rh)+1;
       
    }
    public static void main(String[] args) {
        //First Test case
        Node root = new Node(3);
        root.left= new Node(9);
        root.right= new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println("Maximum Depth of the tree is : "+maximumDepthOfTree(root));
        //Second Test Case
        Node root1 = new Node(1);
        root1.right = new Node(2);
        System.out.println("Maximum Depth of the tree is : "+maximumDepthOfTree(root1));

        
    }
}
