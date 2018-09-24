package com.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Xyz 
{
	public static void main(String[] args) 
	{
		String ch;
		
	LinkedList<Integer> int1=new LinkedList<>();
	int1.add(3);
	int1.add(4);
	int1.add(5);
	Collections.reverse(int1);
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
