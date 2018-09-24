package com.pack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LruAss 
{
	public static void main(String[] args) 
	{
		Integer i;
		LinkedList<Integer> int1=new LinkedList<>();
		String ch="";
		do
		{
		System.out.println("enter element to be added");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		int1.addFirst(i);
		for(Integer str:int1)
		{
			System.out.println(str);
		}
	
		}while(int1.size()!=3);
		do
		{
		System.out.println("Enter Element to be added");
		Scanner sc=new Scanner(System.in);
		Integer n=sc.nextInt();
		if((int1.size()==3)&&(!(int1.contains(n))))
		{
			int1.addFirst(n);
			int1.removeLast();
		}
		if(int1.contains(n))
		{
			int1.remove(n);
			int1.addFirst(n);
		}
		for(Integer str:int1)
		{
			System.out.println(str);
		}
		System.out.println("Do you want to continue");
		ch=sc.next();
		}while(ch.equals("Y")||ch.equals("y"));
		}	
	}


