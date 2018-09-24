package com.pack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Stackls 
{
	public static void main(String[] args) {
		
		String ch="";
		

	do
	{
		Stack<Integer> int2=new Stack<>();
		int2.push(5);
		int2.push(6);
		int2.push(7);
		Scanner sc=new Scanner(System.in);
		System.out.println(int2.pop()+""+int2.pop()+""+int2.pop());
		if(int2.size()==3)
		{
			int2.pop();
			int2.push(9);
			System.out.println(int2);
		}
System.out.println("Do you want to continue");
ch=sc.next();
	}while(ch.equals("Y")||ch.equals("y"));
/*System.out.println(int1.removeLast());
Stack<Integer> int2=new Stack<>();
int2.push(5);
int2.push(6);
int2.push(7);
System.out.println(int2.pop()+""+int2.pop()+""+int2.pop());*/

}
}
