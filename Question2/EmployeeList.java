package Question2;

public class EmployeeList 
{
	Employee head = null;
	Employee sorted = null;
	/**
	 * to add employee details in the linklist
	 * @param emp Employee details
	 */
	public void addEmployee(Employee emp)
	{
		if(emp == null)
			throw new AssertionError("Employee can't be null");
		
		emp.next = head;
		head = emp;
			
	}
	
	/**
	 * to sort the employee list according to their salary and age
	 */
	public void sort()
	{
		Employee current = head;
		Employee next = null;
		Employee temp;
		while(current != null)
		{
			next = current.next;
			addToSortd(current);
			current = next;

		}
		head = sorted;
		
	}
	
	public void addToSortd(Employee newNode)
	{	
		
		if(sorted == null || sorted.getSalary() < newNode.getSalary())
		{	
			newNode.next = sorted;
			sorted = newNode;
		}
		else if(sorted.getSalary() == newNode.getSalary())
		{
				if(sorted.getAge() < newNode.getAge())
				{
					newNode.next = sorted;
					sorted = newNode;
				}
				else
				{
					newNode.next = sorted;
					sorted = newNode;
				}
					
		}
		else
		{
			Employee current = sorted;
			while(current.next != null && current.next.getSalary() > newNode.getSalary())
			{
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	
	/**
	 * to display employee list
	 */
	public void printLinkList()
	{	Employee temp = head;
		while(temp != null)
		{
			System.out.println(temp.getName()+"  "+temp.getAge()+"   "+temp.getSalary());
			temp = temp.next;
		}
	}
}
