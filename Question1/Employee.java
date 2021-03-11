
public class Employee 
{
	private int employeId;
	private String employeName;
	private String employeAddress;
	
	public Employee(int empId, String empName, String empAddress)
	{
		this.employeId = empId;
		this.employeName = empName;
		this.employeAddress = empAddress;
	}
	
	/**
	 * to get the Employee ID
	 * @return Will return Employee ID
	 */
	public int getEmployeID()
	{
		return this.employeId;
	}
	
	/**
	 * to get the Employee Name
	 * @return Will return Employee Name
	 */
	public String getEmployeName()
	{
		return this.employeName;
	}
	
	/**
	 * to get the Employee Address
	 * @return Will return Employee Address
	 */
	public String getEmployeAddress()
	{
		return this.employeAddress;
	}
	
}
