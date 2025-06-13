package com.datastructure.queue;

import java.util.Stack;

public class QueueUsingStack {

		static Stack<Integer> s1 = new Stack<Integer>();

		static Stack<Integer> s2 = new Stack<Integer>();
		
		public boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
		public void add(int data)
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			s1.push(data);
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}
		
		public int remove()
		{
			if(s1.empty())
			{
				System.out.println("Queue Is empty");
				return -1;
			}
			else {
				return s1.pop();
			}
		}
		
		public int peak()
		{
			if(s1.empty())
			{
				System.out.println("Queue Is empty");
				return -1;
			}
				return s1.peek();
		}
		
		
		public static void main(String[] args) {
			QueueUsingStack q = new QueueUsingStack();
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
			q.remove();

			System.out.println("q.peak()=> " + q.peak());
			
			while(!q.isEmpty())
			{
				System.out.println(q.peak());
				q.remove();
			}
			
		}
}

