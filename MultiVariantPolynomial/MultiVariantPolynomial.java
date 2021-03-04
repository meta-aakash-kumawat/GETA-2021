
public class MultiVariantPolynomial 
{
	Node head = null;
	class Node
	{
		int data;
		Node next;
		Node down;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.down = null;
		}
	}
	
	/**
	 * To create a linklist form the given Array data
	 * @param coefficient coefficient of the multivariable polynomial
	 * @param exponent exponents of multivariable polynomial
	 */
	public void helper(int coefficient[] , int exponent[][])
	{
		int expo[] = new int[exponent[0].length];
		for(int i = 0; i< coefficient.length ;i++)
		{
			for(int j = 0; j< exponent[0].length; j++)
			{
				expo[j] = exponent[i][j];
			}
			creatLinkList(coefficient[i] ,expo);
		}
	}
	
	/**
	 * To create linklist for a particular exponent in the polynomial
	 * @param coefficient coefficient of that exponent expression
	 * @param exponentArray exponent in the polynomial
	 */
	public void creatLinkList(int coefficient , int exponentArray[])
	{
		Node newNode = new Node(coefficient);
		if(head == null)
		{
			head = newNode;
		}
		
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp =temp.next;
			}
			temp.next=newNode;
		}
		for(int i=0 ;i<exponentArray.length ;i++)
		{
			Node node = new Node(exponentArray[i]);
			newNode.down = node;
			newNode = node;
		}
	}
	
	
	/**
	 * TO find out the degree of the given multivariant polynomial
	 * @return will return the degree of the polynomial
	 */
	public int degree()
	{
		int max = 0;
		if(head == null)
		{
			System.out.println("Empty list");
			return 0;
		}
		Node temp = head;
		while(temp !=null)
		{
			int sum = 0;
			Node node =temp;
			while(node.down !=null)
			{
				sum = sum +node.down.data;
				node =node.down;
			}
			if(sum > max)
			{
				max = sum;
			}
			temp = temp.next;
		}
			
		return max;
	}
}
