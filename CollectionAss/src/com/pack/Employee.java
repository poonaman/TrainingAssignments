package com.pack;
public class Employee implements Comparable<Employee>
{
	private Integer id;
    private String name;
    private int age;
    private Double sallary;
    public Employee() 
    {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, double sallary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sallary = sallary;
	}
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public Double getSallary() 
	{
		return sallary;
	}
	public void setSallary(Double sallary) 
	{
		this.sallary = sallary;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sallary=" + sallary + "]";
	}
	@Override
	public int compareTo(Employee emp) 
	{
		if(this.sallary==emp.sallary)
		{
			return 0; 
		}
			else if(this.sallary>emp.sallary)  
		{
			return -1;  
		}
			else
		{
			return 1; 
		}
		
	}
	
	
	public boolean equals(Employee obj) 
	{
		if((this.id.equals(obj.getId()))&&(this.name.equals(obj.getName())))
		{
			return true;
		}
		return false;
		
	}


	 
	 
}
