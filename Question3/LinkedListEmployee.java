package Question3;

public class LinkedListEmployee 
{
	public EmployeeNode head;
	int data;
	Employee employeeObject;

	public LinkedListEmployee insert(LinkedListEmployee list, Employee employeeObject) 
	{
		if (employeeObject == null) 
		{
			System.out.println("Object is Empty");
		}
		EmployeeNode newNode = new EmployeeNode(employeeObject);
		if (list.head == null)
		{
			list.head = newNode;
		}
		else 
		{
			EmployeeNode curr = list.head;
			while (curr.next != null) 
			{
				curr = curr.next;
			}
			curr.next = newNode;
		}
		return list;
	}

	public EmployeeNode quickSort(LinkedListEmployee list) 
	{
		if (list.head == null || list.head.next == null)
		{
			return list.head;
		}
		return quick(list.head, null);
	}

	private EmployeeNode quick(EmployeeNode start, EmployeeNode end)
	{
		if (start == null || start == end || start.next == end) 
		{
			return start;
		}

		EmployeeNode[] result = partition(start, end);
		EmployeeNode resultLeft = quick(result[0], result[1]);
		EmployeeNode resultRight = quick(result[1].next, end);
		return resultLeft;
	}
	
	private EmployeeNode[] partition(EmployeeNode start, EmployeeNode end)
	{
		if (start == null || start == end || start.next == end) 
		{
			return new EmployeeNode[] { start, start };
		}
		EmployeeNode dummyNode = new EmployeeNode();
		dummyNode.next = start;

		for (EmployeeNode j = start; j != null && j.next != null && j.next != end; j = j.next) 
		{
			while (j.next != null && j.next.getData().getSalary() >= start.getData().getSalary()) 
			{
				EmployeeNode tmp = j.next;
				j.next = j.next.next;
				tmp.next = dummyNode.next;
				dummyNode.next = tmp;
			}
		}

		return new EmployeeNode[] { dummyNode.next, start };
	}

	public void display(EmployeeNode list)
	{
		EmployeeNode current = list;
		try 
		{
			if (list == null) 
			{
				System.out.println("list is empty");
			}
		} 
		catch (Exception e)
		{
			e.getStackTrace();
		}
		while (current.next != null)
		{
			current.getData().displayEmployeeInfo();
			current = current.next;
		}
		current.getData().displayEmployeeInfo();
		System.out.println();
	}

	public static void main(String[] args) 
	{
		LinkedListEmployee list = new LinkedListEmployee();
		list = list.insert(list, new Employee(1,"Aakash",1000,21));
		list = list.insert(list, new Employee(2,"Sachin",999,18));
		list = list.insert(list, new Employee(4,"Raksha",1000,19));
		list = list.insert(list, new Employee(7,"Sid",11111,28));
		list = list.insert(list, new Employee(11,"Khushi",100,30));
		list = list.insert(list, new Employee(18,"mahima",2000,15));
		
		EmployeeNode newNode = list.quickSort(list);
		list.display(newNode);
	}

}