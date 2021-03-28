package Question2;

public class Employee 
{
	int age;
	String name;
	int salary;
	Employee next;
	
	public Employee(String name, int salary, int age)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	
	public String getName()
	{
		return this.name;
	}
}
