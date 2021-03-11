import java.util.Comparator;


public class sortByName implements Comparator<Employee>
{
	public int compare(Employee emp1, Employee emp2) 
	{
		return emp1.getEmployeName().compareToIgnoreCase(emp2.getEmployeName());		
	}
}
