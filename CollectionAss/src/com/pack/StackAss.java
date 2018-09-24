package com.pack;

import java.util.Stack;

public class StackAss 
{
	
public static void main(String[] args) 
{
int flag=0;
	String x="{([])}";
	
	
	char c[]=x.toCharArray();
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
	if(flag==1)
	{
		System.out.println("Match");
	}
	else
	{
		System.out.println("Not Match");
	}
}
}
