public class ProblemTwentyFive {
    // 9, -1, 5 ,6 , 3
	node head;
	node sort;

	 static class node
	{
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}

	void push(int val)
	{
		node newnode = new node(val);
		newnode.next = head;
		head = newnode;
	}
	void insertionSort(node headref)
	{
		sort = null;
		node current = headref;
		while (current != null)
		{

			node next = current.next;
			sortedInsert(current);

			current = next;
		}
		head = sort;
	}

	void sortedInsert(node newnode)
	{
		if (sort == null || sort.val >= newnode.val)
		{
			newnode.next = sort;
			sort = newnode;
		}
		else
		{
			node current = sort;
			while (current.next != null && current.next.val < newnode.val)
			{
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
		}
	}

	void printlist(node head)
	{
		while (head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	public static void main(String[] args)
	{
		ProblemTwentyFive list = new ProblemTwentyFive();
		//First Input case
		list.push(4);
		list.push(2);
		list.push(1);
		list.push(3);

		list.insertionSort(list.head);
		System.out.println("After sorting");
		list.printlist(list.head);
		ProblemTwentyFive list1 = new ProblemTwentyFive();
		
		list1.push(5);
		list1.push(3);
		list1.push(4);
		list1.push(0);
		list1.push(-1);
		
		list.insertionSort(list.head);
		System.out.println("After sorting");
		list.printlist(list1.head);

	}
}

    

