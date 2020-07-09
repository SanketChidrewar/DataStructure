package com.dll;

import java.util.NoSuchElementException;

public class Dll {
	
	private ListNode head;
	private ListNode tail;
	int length;
	
	public class ListNode{
		private int data;
		private ListNode prev;
		private ListNode next;
		
		ListNode(int data)
		{
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	Dll()
	{
		this.length = 0;
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty()
	{
		if(head == null && tail == null)
		{
			return true;
		}
		return false;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void DisplayForword()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}
	
	public void DisplayBackword()
	{
		ListNode temp = tail;
		while(temp != null)
		{
			System.out.print(temp.data + "-->");
			temp = temp.prev;
		}
	}
	
	public void InsertNodeAtBeginning(int data)
	{
		ListNode newNode = new ListNode(data);
		if(isEmpty())
		{
			tail = newNode;
		}
		else
		{
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public void InsertNodeAtEnding(int data)
	{
		ListNode newNode = new ListNode(data);
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
		}
		tail = newNode;
		length++;
	}
	
	public void DeleteFirstNodeInDLL()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("The List is empty");
		}
		else if(length == 1)
		{
			head = null;
			tail = null;
			length--;
		}
		else
		{
			head.next.prev = null;
			head = head.next;
			length--;
		}
	}

	public void DeleteLastNodeInDLL()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("The List is empty");
		}
		else if(length == 1)
		{
			head = null;
			tail = null;
			length--;
		}
		else
		{
			tail = tail.prev;
			tail.next = null;
			length--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dll dll = new Dll();

		dll.InsertNodeAtEnding(30);
		dll.InsertNodeAtBeginning(20);
		dll.InsertNodeAtBeginning(10);
		dll.DeleteFirstNodeInDLL();
		dll.DeleteLastNodeInDLL();
		
		System.out.println("\nPrinting in Forword direction :");
		dll.DisplayForword();
		
		System.out.println("\n\nPrinting in Backword direction :");
		dll.DisplayBackword();

	}

}
