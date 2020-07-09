package com.circular.SLL;

import java.util.NoSuchElementException;

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
		
		System.out.print("\n"+temp.data + "-->");
		temp = temp.next;
		
		while(temp != first)
		{
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}
	
	public void InsertNodeAtTheBeginningOfCSLL(int data)
	{
		ListNode newNode = new ListNode(data);
		if(last == null)
		{
			last = newNode;
			newNode.next = last;
		}
		newNode.next = last.next;
		last.next = newNode;
		
		length++;
	}
	
	public void InsertNodeAtTheEndOfCSLL(int data)
	{
		ListNode newNode = new ListNode(data);
		if(last == null)
		{
			last = newNode;
			newNode.next = last;
		}
		newNode.next = last.next;
		last.next = newNode;
		last = newNode;
		
		length++;
	}
	
	public void DeleteFirstNodeFromCSLL()
	{
		if(IsEmpty())
		{
			throw new NoSuchElementException("Circular Singly Linked List is Empty");
		}
		ListNode temp = last.next;
		if(last == temp)
		{
			last = null;
		}
		else
		{
			last.next = temp.next;
		}
		temp.next = null;
		length--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Csll csll = new Csll();
		System.out.print("\n\nCreating and printing Circular Linked list ");
		csll.CreateCircularSinglyLinkedList();
		csll.displayCSLL();
		
		System.out.print("\n\nAdding node at end of Circular Linked list ");
		csll.InsertNodeAtTheEndOfCSLL(47);
		csll.displayCSLL();
		
		System.out.print("\n\nAdding node at start of Circular Linked list ");
		csll.InsertNodeAtTheBeginningOfCSLL(-25);
		csll.displayCSLL();
		
		System.out.print("\n\nDeleting first node of Circular Linked list ");
		csll.DeleteFirstNodeFromCSLL();
		csll.displayCSLL();
		
		System.out.print("\n\nDeleting first node of Circular Linked list ");
		csll.DeleteFirstNodeFromCSLL();
		csll.displayCSLL();

	}
}
