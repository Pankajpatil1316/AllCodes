package com.datastructure.DoublyLinkedList;

public class DoublyLinkedList {

	DoublyNode head;
	//10->09->08
	public void inserAtBegining(String data)
	{
		DoublyNode newNode = new DoublyNode(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		head.prev = newNode;
		
		newNode.next=head;
		
		head= newNode;
		
	}
	
	//10->09->08
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	//10<->09<->08
	void insertAtLast(String data)
	{
		DoublyNode newNode = new DoublyNode(data);
		DoublyNode currentNode = head;
		
		if(head == null)
		{
			head= newNode;
			return;
		}
		
		while(currentNode.next!=null)
		{
			currentNode= currentNode.next;
		}
		currentNode.next=newNode;
		newNode.prev=currentNode;
	}
	//10->09->08
	void deleteLast()
	{
		DoublyNode currentNode = head;
		
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		while(currentNode.next.next!=null)
		{
			currentNode= currentNode.next;
		}
		currentNode.next=null;
		
	}
	
	//60<->50<->40<->30<->20<->10<->NULL
	public void deleteByData(String data)
	{
		DoublyNode currentNode = head;
		
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(head.data==data)
		{
			head=head.next;
			if(head!=null)
			{
				head.prev=null;
			}
		}
		
		
		while(currentNode.next.data!=data)
		{
			currentNode= currentNode.next;
		}
		currentNode.next=currentNode.next.next;
		currentNode.next.prev=currentNode;
	}
	
	
	public void display()
	{
		DoublyNode currentNode = head;
		
		while(currentNode!=null)
		{
			System.out.print(currentNode.data + "<->");
			currentNode = currentNode.next;
		}
		System.out.print("NULL");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.inserAtBegining("10");
		list.inserAtBegining("20");
		list.inserAtBegining("30");
		list.inserAtBegining("40");
		list.inserAtBegining("50");
		list.inserAtBegining("60");
		list.inserAtBegining("70");
		list.insertAtLast("09");
		list.deleteFirst();
		list.deleteLast();
		list.deleteByData("20");
		list.display();
		

	}

}
