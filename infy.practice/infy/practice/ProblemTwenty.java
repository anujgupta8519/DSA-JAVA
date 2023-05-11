public class ProblemTwenty {
	Node root;
	boolean isMirror(Node node1, Node node2)
	{

		if (node1 == null && node2 == null){
            return true;

        }
			
		if (node1 != null && node2 != null && node1.key == node2.key){
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));

        }

		return false;
	}

	boolean isSymmetric()
	{

		return isMirror(root, root);
	}

	public static void main(String args[])
	{
		ProblemTwenty b1 = new ProblemTwenty();
		b1.root = new Node(1);
		b1.root.left = new Node(2);
		b1.root.right = new Node(6);
		b1.root.left.left = new Node(3);
		b1.root.left.right = new Node(4);
		b1.root.right.left = new Node(4);
		b1.root.right.right = new Node(3);
		System.out.println(b1.isSymmetric());
	
	}
}
class Node {
	int key;
	Node left, right;
    public Node next;
	Node(int item)
	{
		key = item;
		left = right = null;
	}
}

