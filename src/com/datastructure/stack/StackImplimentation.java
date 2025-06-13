package com.datastructure.stack;
import com.datastructure.stack.Node;
public class StackImplimentation {
	
	Node top;
	int size;
	StackImplimentation(){
		top=null;
		size=0;
	}
	
	//11->10->09->08
	void push(String data)
	{
		Node newNode = new Node(data);
		newNode.next = top;
		top= newNode;
		size++;
		
	}
	
	//11->10->09->08
	String pop()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("Stack is empty");
		}
		String data = top.data;
		top = top.next;
		size--;
		return data;	
	}
	
	public boolean isEmpty() {
        return top == null;
    }
	void displayStack()
	{
		Node current = top;
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }
	 public int size() {
	        return size;
	    }
	 
	public static void main(String[] args) {
		 StackImplimentation stack = new StackImplimentation();
	        stack.push("10");
	        stack.push("20");
	        stack.push("30");
	        stack.pop();
	        stack.pop();
	        stack.pop();
	       stack.push("12");
	       stack.push("14");
	       stack.push("16");
	       System.out.println("Size " + stack.size());
	       System.out.println("peek " + stack.peek());
	        
	        stack.displayStack();
	}
}
