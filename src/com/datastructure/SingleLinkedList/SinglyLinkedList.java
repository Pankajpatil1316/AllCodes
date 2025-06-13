package com.datastructure.SingleLinkedList;

public class SinglyLinkedList {
    private int size=0;
	Node head;

    //to add the element at begining of linkedlist
    // 30->20->10->null if u add new element(40) then it will add first i.e. 40->30->20->10->null
    public void insertAtBegining(String data) 
    {
    	Node newNode = new Node(data);
    	size++;
    	if(head==null)
    	{
    		head= newNode;
    		return;
    	}
    	newNode.next = head;
    	head = newNode;
    }
    
    public void deleteFirst()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		return;
    	}
    	size--;
    	head = head.next;
    	
    }
    //to add the element at end of linkedlist
 // 30->20->10->null if u add new element(09) then it will  i.e. 30->20->10->09->null
    public void insertAtEnd(String data)
    {
    	Node newNode = new Node(data);
    	Node currentNode = head;
    	
    	while(currentNode.next!=null) 
    	{
    		currentNode=currentNode.next;
    	}
    	size++;
    	currentNode.next=newNode;   	
    }
    //delete the last node
    public void deleteLast() 
    {
    	
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		return;
    	}
    	
    	if(head.next==null)
    	{
    		size--;
    		head=null;
    		return;
    	}
    	Node lastNode = head.next;
    	Node SecondlastNode = head;
    	while(lastNode.next!=null)
    	{
    		SecondlastNode=lastNode;
    		lastNode=lastNode.next;
    		
    	}
    	size--;
    	SecondlastNode.next=null;
    	
    }
    //delete the node by value
    void deleteByValue(String data)
    {
    	Node current = head;
    	if(head==null)
    	{
    		return;
    	}
    	
    	if(head.data==data)
    	{
    		size--;
    		head=head.next;
    	}
    	while(current.next!=null && current.next.data!=data)
    	{
    		current=current.next;
    	}
    	if (current.next != null) {
    		size--;
            current.next = current.next.next;
        }
    	else {
    		System.out.println("Value not present.");
    	}
    }
    
    //to dispplay the list
    public void display()
    {
    	Node currentNode = head;
    	
    	if(head!=null) {
    		while(currentNode!=null) {
        		System.out.print(currentNode.data + "->");
        		currentNode = currentNode.next;
        	}
        	System.out.println("null");
    	}
    	System.out.println("size is " + size);
    }
    
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBegining("10");
        list.insertAtBegining("20");
        list.insertAtBegining("30");
		list.insertAtEnd("09");
		list.insertAtEnd("08");
//        list.deleteFirst();
//        list.deleteLast();
//        list.deleteByValue("0");
        list.display();
    }
}
