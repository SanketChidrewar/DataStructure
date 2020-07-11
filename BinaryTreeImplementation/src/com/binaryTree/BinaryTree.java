package com.binaryTree;


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
		
		public void PreOrderTrav(TreeNode root)
		{
			if(root == null)
				return;
			
			System.out.print(root.data + "  ");
			PreOrderTrav(root.left);
			PreOrderTrav(root.right);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		//System.out.println(bt.root.data+"(root)" + "-->" + bt.root.left.data+"(root left node)");
		System.out.println("\nPRE-ORDER TRAVERSAL OF TREE :");
		bt.PreOrderTrav(bt.root);

	}

}
