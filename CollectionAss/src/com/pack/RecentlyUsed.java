package com.pack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RecentlyUsed 
{
	public static void main(String[] args) 
	{
		int j=0;
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=0;
		String ch;
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(5);
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Integer emp=(Integer)iter.next();
			map.put(j,emp);
			j++;
        }
		/*
		{
			System.out.println("1.Add");
			System.out.println("1.Display");
			System.out.println("Enter Your Choice");
			int name=sc.nextInt();
			switch(name)
			{
			case 1:
		   System.out.println("Enter the numbers");
		
		   Integer i=sc.nextInt();
		   map.put(j,i);
		   j++;*/
		   for (Map.Entry<Integer,Integer> entry : map.entrySet())
		    {
			  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		 	}
		  /* break;
			case 2:
				 for (Map.Entry<Integer,Integer> entry : map.entrySet())
				    {
				    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				 	}
			}
	    System.out.println("Do you want to continue");
	     ch=sc.next();
	    
			
		}while(ch.equals("y")||ch.equals("Y"));
		*/
	}

}
