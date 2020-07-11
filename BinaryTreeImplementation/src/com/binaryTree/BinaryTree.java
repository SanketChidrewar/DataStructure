package com.binaryTree;

import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		TreeNode(int data )
		{
			this.data = data;
		}
	}
	
		BinaryTree()
		{
			this.root = null;
		}

		public void createBinaryTree()
		{
			TreeNode first = new TreeNode(1);
			TreeNode second = new TreeNode(2);
			TreeNode third = new TreeNode(3);
			TreeNode fourth = new TreeNode(4);
			TreeNode fifth = new TreeNode(5);
			TreeNode sixth = new TreeNode(6);
			TreeNode seventh = new TreeNode(7);

			
			
			root = first;
			first.left = second;
			first.right = third;
			
			second.left = fourth;
			second.right = fifth;
			
			third.left = sixth;
			third.right = seventh;
		}
		
		public void ReccursivePreOrderTrav(TreeNode root)
		{
			if(root == null)
				return;
			
			System.out.print(root.data + "  ");
			ReccursivePreOrderTrav(root.left);
			ReccursivePreOrderTrav(root.right);
		}
		
		public void IterativePreOrderTrav()
		{
			if(root == null)
				return;
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while(!stack.isEmpty())
			{
				TreeNode temp = stack.pop();
				System.out.print(temp.data + "  ");
				if(temp.right != null)
				{
					stack.push(temp.right);
				}
				if(temp.left != null)
				{
					stack.push(temp.left);
				}
			}
		}
		
		public void reccursiveInOrderTrav(TreeNode root)
		{
			if(root == null)
			{
				return;
			}
			
			reccursiveInOrderTrav(root.left);
			System.out.print(root.data + "  ");
			reccursiveInOrderTrav(root.right);

		}
		
		public void IterativeInOrderTrav()
		{
			if(root == null)
				return;
			Stack<TreeNode> stack = new Stack<>();
			TreeNode temp = root;

			while(!stack.isEmpty() || temp!=null)
			{
				if(temp!=null)
				{
					stack.push(temp);
					temp = temp.left;
				}
				else
				{
					temp = stack.pop();
					System.out.print(temp.data + "  ");
					temp = temp.right;
				}
			}

		}
		
		public void reccursivePostOrderTrav(TreeNode root)
		{
			if(root == null)
			{
				return;
			}
			
			reccursivePostOrderTrav(root.left);
			reccursivePostOrderTrav(root.right);
			System.out.print(root.data + "  ");

		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		//System.out.println(bt.root.data+"(root)" + "-->" + bt.root.left.data+"(root left node)");
		
		System.out.println("\n Reccursive PRE-ORDER TRAVERSAL OF TREE :");
		bt.ReccursivePreOrderTrav(bt.root);
		
		System.out.println("\n Iterative PRE-ORDER TRAVERSAL OF TREE :");
		bt.IterativePreOrderTrav();
		
		System.out.println("\n Reccursive In-ORDER TRAVERSAL OF TREE :");
		bt.reccursiveInOrderTrav(bt.root);
		
		System.out.println("\n Iterative In-ORDER TRAVERSAL OF TREE :");
		bt.IterativeInOrderTrav();

		
		System.out.println("\n Reccursive Post-ORDER TRAVERSAL OF TREE :");
		bt.reccursivePostOrderTrav(bt.root);

		

	}

}
