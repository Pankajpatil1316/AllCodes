package com.datastructure.SingleLinkedList;

public class Demo {

	Node head;
	int size=0;

	public Demo() {
		this.size = 0;
	}

	public void insetAtBeginning(String data)
	{
		Node newNode = new Node(data);
		size++;
		if(head==null)
			head=newNode;
		else {
			newNode.next=head;
			head=newNode;
		}
	}

	public void insertAtEnd(String data){
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head=newNode;
		}
		else {
			Node currenNode = head;
			while (currenNode.next!=null)
			{
				currenNode=currenNode.next;
			}
			currenNode.next=newNode;
		}

	}

	public void deleteFirst(){

		if(head==null)
			System.out.println("Linked list is empty");
		else {
			size--;
			head=head.next;
		}
	}

	public void deleteLast(){
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null){
			head=null;
			return;
		}
		Node currentNode = head;

		while (currentNode.next.next!=null){
			currentNode=currentNode.next;
		}
		currentNode.next=null;
	}
	public void display()
	{
		Node currentNode = head;
		if(currentNode==null){
			System.out.println("Linked List is empty");
			return;
		}

		while (currentNode!=null){
			System.out.print(currentNode.data + "->");
			currentNode=currentNode.next;
		}
		System.out.println("NULL");

		System.out.println("Size of List is " + size);
	}

	public static void main(String[] args) {
		Demo linkedList = new Demo();
		linkedList.insetAtBeginning("10");
		linkedList.insetAtBeginning("20");
		linkedList.insetAtBeginning("30");
		linkedList.insetAtBeginning("40");
		linkedList.insertAtEnd("09");
		linkedList.insertAtEnd("08");

		linkedList.deleteFirst();
		linkedList.deleteLast();
		linkedList.display();
	}

}
