package Question3;

public class EmployeeNode 
{
	public Employee data;
	public EmployeeNode next;
	public EmployeeNode(){}
	public EmployeeNode(Employee data)
	{
		this.data = data;
		this.next = null;
	}
	public Employee getData() 
	{
		return data;
	}

}