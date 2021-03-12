import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortEmp 
{
	
	static List<Employee> employee = new ArrayList<Employee>();
	static Set<Integer> empID = new HashSet<Integer>();

	public static void main(String args[])
	{	
		int id;
		String name ;
		String address ;
				Scanner in = new Scanner(System.in);
		int loop = 1;
		while(loop == 1)
		{
			System.out.println("Enter Employee id");
			id = in.nextInt();
			System.out.println("Enter Employee Name");
			name = in.next();
			System.out.println("Enter Employee Address");
			address = in.next();
			
			if(empID.contains(id))
				throw new AssertionError("Employee Id already taken");
			empID.add(id);
				
			addDetails(id,name,address);
			System.out.println("TO add more Employeee press 1 Otherwise press any key");
			loop = in.nextInt();
		}
		System.out.println("Employee details before");
		DisplayDetails();
		
		int choice;
		while(true)
		{
			System.out.println("1. press 1 to sort by employee ID\n"+
								"2. press 2 to sort by employee name\n"+
								"3. To exit");
			choice =in.nextInt();
			switch(choice)
			{
			case 1:
				Comparator<Employee> com = new sortByID();
				Collections.sort(employee,com);
				System.out.println("Employee details After");
				DisplayDetails();
				break;
			
			case 2:
				Comparator<Employee> comm = new sortByName();
				Collections.sort(employee,comm);
				System.out.println("Employee details After");
				DisplayDetails();
				break;
			case 3:
				System.exit(0);
			}
		}	
	}
	
	public static void addDetails(int empID, String name, String address)
	{
		employee.add(new Employee(empID,name,address));
	}
	
	public static void DisplayDetails()
	{
		for(Employee i : employee)
		{
			System.out.print(i.getEmployeID()+"   "+i.getEmployeName()+"   "+i.getEmployeAddress());
			System.out.println();
		}
	}
}
