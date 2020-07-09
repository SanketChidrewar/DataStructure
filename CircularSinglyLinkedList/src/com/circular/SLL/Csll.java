package com.circular.SLL;

public class Csll {

	private ListNode last;
	private int length;
	
	public class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public Csll()
	{
		last = null;
		length = 0;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public boolean IsEmpty()
	{
		return length == 0;
	}
	
	public void CreateCircularSinglyLinkedList()
	{
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(24);
		ListNode fifth = new ListNode(33);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = first;
		
		last = fifth;
		
		length = 5;
	}
	
	public void displayCSLL()
	{
		if(last == null)
		{
			return;
		}
		
		ListNode first = last.next;
		ListNode temp = last.next;
		
		System.out.print(temp.data + "-->");
		temp = temp.next;
		
		while(temp != first)
		{
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Csll csll = new Csll();
		csll.CreateCircularSinglyLinkedList();
		csll.displayCSLL();

	}

}
