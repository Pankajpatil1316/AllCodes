package com.datastructure.queue;

public class QueueUsingArray {


	static int arr[];
	static int size;
	static int rear =-1;
	static int front =-1;
	
	QueueUsingArray(int n)
	{
		arr = new int[n];
		this.size = n;
		
	}
	
	static boolean isEmpty()
	{
		return rear==-1 &&  front ==-1;
	}
	
	static boolean isFull()
	{
		return (rear+1) % size==front;
	}
	
	//enqueue
	//1 is front
	// 4 is rear
	//1-2-3-4-5-
	static void add(int data)
	{
		if(isFull())
		{
			System.out.println("Queue Full");
			return;
		}
		
		//first element add
		if(front ==-1)
		{
			front =0;
		}
		rear = (rear+1) % size; 
		arr[rear] = data;
	}
	
	//dequeue -o(n)
	static int remove()
	{
		if(isEmpty())
		{
			System.out.println("Empty Queue");
			return -1; 
		}
		
		int result = arr[front];
		//single element condition
		if(rear==front)
		{
			rear=front=-1;
		}
		else {
			front= (front+1)%size;
		}
		return result;
	}
	
	//peek/front element
	static int peek()
	{
		if(isEmpty())
		{
			System.out.println("Empty Queue");
			return -1; 
		}
		return arr[front];
	
	}
	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(5);
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		
		
		while(!isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}
