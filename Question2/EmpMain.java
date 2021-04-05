package Question2;

public class EmpMain 
{
	public static void main(String args[])
	{
		EmployeeList empl = new EmployeeList();
		empl.addEmployee(new Employee("AAKSH",678,18));
		empl.addEmployee(new Employee("Sachin",1234,20));
		empl.addEmployee(new Employee("Khushi",2222,20));
		empl.addEmployee(new Employee("Siddharth",1000,20));
		empl.addEmployee(new Employee("Mahima",2222,30));
		empl.addEmployee(new Employee("blender",3222,67));
		empl.printLinkList();
		System.out.println();
		empl.sort();
		empl.printLinkList();
	}
}
