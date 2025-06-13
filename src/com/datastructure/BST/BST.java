package com.datastructure.BST;

public class BST {
	
	public static Node insert(Node root, int value)
	{
		if(root == null)
		{
			root = new Node(value);
			return root;
		}
		
		if(root.data > value)
		{
			//left sub tree
			root.left = insert(root.left, value); 
		}
		else
		{
			root.right = insert(root.right, value);
		}
		return root;
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static boolean search(Node root, int key)
	{
		if(root ==null)
		{
			return false;
		}
		
		if(key < root.data)
		{
			return search(root.left, key);
		}
		else if(key > root.data)
		{
			return search(root.right, key);
		}
		else if(key == root.data){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		for(int i=0 ; i<values.length; i++)
		{
			root = insert(root, values[i]);
		}

		inorder(root);
		System.out.println();
		
		System.out.println(search(root, 12));
	}
}
