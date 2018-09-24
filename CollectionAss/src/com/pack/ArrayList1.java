package com.pack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayList1 
{
Scanner sc=new Scanner(System.in);
public void Search(List set)
	{
		
		System.out.println("enter id to be searched");
		Integer id=sc.nextInt();
		System.out.println("enter name to be searched");
		String name=sc.next();
		Iterator iter = set.iterator();
		while (iter.hasNext()) 
		{
		    Employee emp=(Employee)iter.next();
		    if((emp.getId().equals(id)) &&(emp.getName().equals(name)))
		    {
		    	System.out.println("Employee Present"+emp.getId()+emp.getName());
		    }
		    else
		    {
		    	System.out.println("Element Already Present");
		    }
		}
	}
public void Sort(List list)
{
Collections.sort(list);
Iterator iter = list.iterator();
while (iter.hasNext()) 
{
    Employee emp=(Employee)iter.next();
  System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSallary()+" "+emp.getAge());
    
} 
	/*ArrayList<Double> array=new ArrayList<>();
Iterator iter=list.iterator();
while(iter.hasNext())
{
	 Employee emp=(Employee)iter.next();
	Double sal= emp.getSallary();
	 array.add(sal);
}


for (int k = 0; k < array.size(); k++)
{

    for (int h = array.size() - 1; h > k; h--) 
    {
        if (array.get(k) < array.get(h)) 
        {

            Double tmp = array.get(k);
            array.set(k,array.get(h)) ;
            array.set(h,tmp);

        }

    }

}
ArrayList<Employee> array1=new ArrayList<>();
Iterator iter1=array.iterator();
while(iter.hasNext())
{
	while(iter1.hasNext())
	{
		Employee emp=(Employee)iter.next();
		if(emp.getSallary().equals(iter1.next()))
		{
			array1.add(emp);
		}
	}
	
}
Iterator iter2=array1.iterator();
while(iter2.hasNext())
{
	Employee emp=(Employee)iter.next();
	System.out.println(emp.getSallary());
}*/
	/*Double[] array=new Double[10];
	Iterator iter=list.iterator();
	int i=0;
	while(iter.hasNext())
	{
		 Employee emp=(Employee)iter.next();
		Double sal= emp.getSallary();
		array[i]=sal;
		i++;
	}


	for (int k = 0; k < array.length; k++)
	{

	    for (int h = array.length - 1; h > k; h--) 
	    {
	        if (array[k] < array[h]) 
	        {

	            Double tmp = array[k];
	            array[k]=array[h] ;
	            array[h]=tmp;

	        }

	    }

	}
	for(int z=0;z<array.length;z++)
	{
		System.out.println(array[z]);
	}
	int j=0;
	ArrayList<Employee> array1=new ArrayList<>();
	while(iter.hasNext())
	{
		Employee emp=(Employee)iter.next();
		if(emp.getSallary().equals(array[j]))
		{
			array1.add(emp);
			j++;
		}
		
	}
	Iterator iter2=array1.iterator();
	while(iter2.hasNext())
	{
		Employee emp=(Employee)iter.next();
		System.out.println(emp.getSallary());
	}*/
}
public void add()
{
	
}
	public static void main(String[] args) 
	{
		//List list=new ArrayList<Employee>();
	
		String ans;
		List list=new ArrayList<Employee>();
	/*	Employee e2=new Employee(2,"sayali",22,30000);
		Employee e3=new Employee(3,"ruchika",23,60000);
		Employee e4=new Employee(4,"ankit",21,900000);
		Employee e5=new Employee(5,"rohan",20,800000);
	//	list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);*/
	    ArrayList1 array=new ArrayList1();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.ADD");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.SORT");
     	System.out.println("Enter Your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("enter id to be entered");
			Integer id=sc.nextInt();
			System.out.println("enter name ");
			String name=sc.next();
			System.out.println("enter age ");
			int age=sc.nextInt();
			System.out.println("enter sallary ");
			int sallary=sc.nextInt();
			Employee e9=new Employee(id,name,age,sallary);
			int flag=0;
			try 
			{
			Iterator iter1 = list.iterator();
			while (iter1.hasNext()) 
			{
			    Employee emp=(Employee)iter1.next();
			    if(((emp.getId().equals(id))&&(emp.getName().equals(name))))
			    {
			    	flag=1;
			    	break;
			    }
			    else
			    {
			    	flag=0;
			    }
			}
			if(flag==1)
			{
				System.out.println("Already Prsent");
			}
			else
			{
				list.add(e9);
			}
			}
			catch(Exception e)
			{
				
			}
			/*if(!((list.contains(id)))&&(list.contains(name)))
			  {
				 list.add(e9);
			  }
            */
			 /*if((e9.equals(emp)))
			    {
				  System.out.println(e9.equals(emp));
			    }
			   else
			    {
				  list.add(e9);
			    }*/
	//System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSallary()+" "+emp.getAge());
			  
			
		

			 break;
		case 2:
			Iterator iter2 = list.iterator();
			while (iter2.hasNext()) 
			{
			    Employee emp=(Employee)iter2.next();
			  System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSallary()+" "+emp.getAge());
			} 
			break;
		case 3:
			array.Search(list);
			break;
		case 4:
			array.Sort(list);
		}
	 

	
	 // array.Search(list);
	  //array.Sort(list);
		System.out.println("Do you want to Continue");
		ans=sc.next();
	}while(ans.equals("y")||ans.equals("Y"));
	
	}

}
