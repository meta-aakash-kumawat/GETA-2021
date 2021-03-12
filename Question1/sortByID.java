import java.util.Comparator;

public class sortByID implements Comparator<Employee>
{	
	public int compare(Employee emp1, Employee emp2) 
	{
		if(emp1.getEmployeID() < emp2.getEmployeID())
			return -1;
		
		else if(emp1.getEmployeID() == emp2.getEmployeID())
			return 0;
		else
			return 1;		
	}
	
}
