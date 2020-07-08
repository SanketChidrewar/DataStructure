package SLL;

public class Sll {

	private ListNode head;
	
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
			ListNode newNode = new Sll.ListNode(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
	public  void displaySll()
	{
		while(head!=null)
		{
			System.out.print(head.data +"-->");
			head = head.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("hello");
		Sll s = new Sll();
		s.AddNodeAtFirst(10);
		s.AddNodeAtFirst(20);
		s.AddNodeAtFirst(30);
		
		s.displaySll();
		

	}

}
