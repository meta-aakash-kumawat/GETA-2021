package Question1;

public class operatorStack 
{
	int top = -1;
	int maxSize = 100;
	char operatorStackArray[] = new char[100];
	
	public void push(char element)
	{
		if(top >= maxSize)
		{
			System.out.println("Overflow stack");
			return;
		}
		top++;
		operatorStackArray[top] = element;
	}
	
	public char pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow Stack");
			return '#';
		}
		char element = operatorStackArray[top];
		top--;
		return element;
	}
	public char peek()
	{
		return operatorStackArray[top];
	}
}
