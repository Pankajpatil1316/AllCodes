package com.Problems;

import java.util.Stack;

public class ParenthesisCheck {

	public static void main(String[] args) {
		String str = "[{{}}]";
		System.out.println(isValidCheck(str));
	}
	
	public static boolean isValidCheck(String string)
	{
		Stack<Character>  stack = new Stack<Character>();
		for(char c : string.toCharArray())
		{
			if(c=='[' || c=='(' || c=='{')
			{
				stack.push(c);
			}
			else if(c==']' &&!stack.isEmpty() && stack.peek()=='[')
			{
				stack.pop();
			}
			else if(c==')' &&!stack.isEmpty() && stack.peek()=='(')
			{
				stack.pop();
			}
			else if(c=='}' &&!stack.isEmpty() && stack.peek()=='{')
			{
				stack.pop();
			}
			else
			{
				return false;
			}
		}
		return stack.isEmpty();
	}
}
