package com.pack;
import java.util.Scanner;
import java.util.Stack;

public class StackAss2 
{
	public static int Verify(String x)
	{
		int flag=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='{'||x.charAt(i)=='['||x.charAt(i)=='(')
			{
				stack.push(x.charAt(i));
			}
			else if(x.charAt(i)=='}')
			{
				if(stack.pop()=='{')
				{
					flag=1;
					continue;
				}
				else
				{
					flag=0;
					break;
				}
			}
			else if(x.charAt(i)==']')
			{
				if(stack.pop()=='[')
				{
					flag=1;
					continue;
				}
				else
				{
					flag=0;
					break;
				}
			}
			else if(x.charAt(i)==')')
			{
				if(stack.pop()=='(')
				{
					flag=1;
					continue;
				}
				else
				{
					flag=0;
					break;
				}
			}
			
		}
	return flag;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
	 int x=   Verify(s); 
	 if(x==1)
	 {
		 System.out.println("Match");
	 }
	 else
	 {
		 System.out.println("Not Match");
	 }
	}

}
