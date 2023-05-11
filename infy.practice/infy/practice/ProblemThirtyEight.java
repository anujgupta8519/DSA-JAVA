public class ProblemThirtyEight {
	Node head; // head of list

      void push(int data){
		Node newNode = new Node(data);
		if (head==null) {
			head=newNode;
			return;
		}
		Node laNode = head;
		while (laNode.next!=null) {
			laNode=laNode.next;
		}
		laNode.next=newNode;
	  }
	  void printlist(){
		Node curr = head;
		while (curr!=null) {
			System.out.print(curr.data+" ->");
			curr=curr.next;
		}

	  }
	  void delete(Node d,int pos){
        if (head == null) {
            return ;
        }   if (pos == 0) {
            head = head.next;
        } else {
			int count = 0;
		Node currHead = head;
		while(currHead != null && count < (pos - 1)) {
			currHead = currHead.next;
			count++;
		}

		if(currHead == null || currHead.next == null) {
			return;
		}

		currHead.next = currHead.next.next;
	  }
	}

	public static void main(String[] args)
	{

		ProblemThirtyEight llist = new ProblemThirtyEight();
		llist.push(4);
		llist.push(5);
		llist.push(1);
		llist.push(9);
		llist.printlist();
		llist.delete(llist.head,1);
		System.out.println();
		llist.printlist();


}
 static class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
}

