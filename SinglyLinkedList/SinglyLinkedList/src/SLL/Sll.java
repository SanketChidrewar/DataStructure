package SLL;


public class Sll {

	private static ListNode head;
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void AddNodeAtFirst(int data)
	{
		if( head == null)
		{
			head = new Sll.ListNode(data);
		}
		else
		{
			ListNode newNode = new ListNode(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void AddNodeAtEnd(int data)
	{
		ListNode temp = head;
		if(temp == null)
		{
			head = new Sll.ListNode(data);
		}
		else
		{
			ListNode newNode = new Sll.ListNode(data);
			while(temp.next != null)
			{
				temp =temp.next;
			}
			
			temp.next = newNode;
		}
	}
	
	public ListNode ReverseSll()
	{
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		if(current == null)
		{
			return null;
		}
		else
		{
			while(current != null)
			{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			}
		}
		return previous;
	}
	
	public void ToPrintSllInReverseUsingReccursion(ListNode temp)
	{
		if(temp != null)
		{
			ToPrintSllInReverseUsingReccursion(temp.next);
			System.out.print(temp.data + "-->");
		}
	}
	
	public int ToGetLengthOfSLL()
	{
		ListNode temp = head;
		int count =0;
		
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public ListNode ToFindMidNodeOfSLL()
	{
		ListNode slowNode = head;
		ListNode fastNode = head;
		
		if(head == null)
		{
			return head;
		}
		else
		{
			while(fastNode != null && fastNode.next != null)
			{
				slowNode = slowNode.next;
				fastNode = fastNode.next.next;
			}
			return slowNode;
		}
	}
	
	public ListNode ToFindNthNodeFromTheLastNode(int n)
	{
		ListNode refNode = head;
		ListNode currentNode = head;
		int count = 0;
		
		if(head == null)
		{
			return head;
		}
		if(n<=0)
		{
			throw new IllegalArgumentException("Invalid Value "+ n);	
		}
		
			while(count < n)
			{
				if(refNode == null)
				{
					throw new IllegalArgumentException(n + "is greater than number of nodes in SLL");	
				}
					refNode = refNode.next;
					count++;
			}
			while(refNode != null)
			{
				refNode = refNode.next;
				currentNode = currentNode.next;
			}
			return currentNode;
	}
	
	public void ToInsertNodeInSortedSLL(int data)
	{
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		ListNode temp = null;

		
		while(current != null && current.data < data)
		{
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
	}
	
	public void DeleteNodeByTakingKeyValue(int key)
	{
		ListNode current = head;
		ListNode temp = null;
		
		while(current != null && current.data != key)
		{
			temp = current;
			current = current.next;
		}
		
		if(current == null)
		{
			return;
		}
		temp.next = current.next;
	}
	
	public void createSLLHavingLoop()
	{
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;

	}
	
	public boolean detectLoopInSLL()
	{
		ListNode slowptr = head;
		ListNode fastptr = head;
		
		while(fastptr != null && fastptr.next != null)
		{
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			
			if(fastptr == slowptr)
			{
				return true;
			}
		}
		return false;
	}
	
	public  void displaySll()
	{
		ListNode temp = head;

		while(temp!=null)
		{
			System.out.print(temp.data +"-->");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("hello");
		Sll s = new Sll();
		s.AddNodeAtEnd(10);
		s.AddNodeAtEnd(20);
		s.AddNodeAtEnd(30);
		s.AddNodeAtEnd(40);
		s.AddNodeAtEnd(50);

		
		System.out.println("\n Linked List :");
		s.displaySll();
		
//		head = s.ReverseSll();
//		System.out.println("\n\n Reversed Linked List :");
//		s.displaySll();

		System.out.println("\n\nPrint Reverse Linked List using reccursion without reversing actual SLL :");		
		s.ToPrintSllInReverseUsingReccursion(head);
		
		System.out.println("\n\nLength of SLL :" + s.ToGetLengthOfSLL());
		
		System.out.println("\n\nMiddle node is :"+ s.ToFindMidNodeOfSLL().data);
		
		ListNode nthTermFromLast = s.ToFindNthNodeFromTheLastNode(2);
		System.out.println("\n\n 2nd term from last node is :"+ nthTermFromLast.data);
		
		System.out.println("\n\n SLL AFTER ADDING 25 in sorted list ");
		s.ToInsertNodeInSortedSLL(25);
		s.displaySll();
		
		System.out.println("\n\n SLL AFTER Deleting node having 25 as a data in it ");
		s.DeleteNodeByTakingKeyValue(25);
		s.displaySll();

		//CODE To Detect a loop in SLL
		s.createSLLHavingLoop(); // creating SLL having loop in it
		boolean b = s.detectLoopInSLL();
		if(b == true)
		{
			System.out.println("\n\nTHE SLL CONTAINS LOOP IN IT ");
		}
		else
		{
			System.out.println("\n\nTHE SLL does not CONTAINS LOOP IN IT ");

		}	
	}
}
