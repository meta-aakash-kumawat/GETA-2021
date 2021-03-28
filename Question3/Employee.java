package Question3;

public class Employee 
{
	private int empId;
	private String name;
	private int salary;
	private int age;

	public Employee(int empId, String name, int salary, int age) 
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public String getName() 
	{
		return name;
	}
	public int getSalary() 
	{
		return salary;
	}
	public int getAge()
	{
		return age;
	}

	public void displayEmployeeInfo() 
	{
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Age: " + age);
	}

}