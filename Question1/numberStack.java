package Question1;

public class numberStack 
{
	int top = -1;
	int maxSize = 100;
	int numberStackArray[] = new int[100];
	
	public void push(int element)
	{
		if(top >= maxSize)
		{
			System.out.println("Overflow stack");
			return;
		}
		top++;
		numberStackArray[top] = element;
	}
	
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow Stack");
			return -1;
		}
		int element = numberStackArray[top];
		top--;
		return element;
	}
	public int peek()
	{
		return numberStackArray[top];
	}
}
