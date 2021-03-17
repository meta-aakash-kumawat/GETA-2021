
public class RotateSubList 
{
	Node headNode = null;
	
	/**
	 * to add  values in the link list
	 * @param value value to be added in list
	 */
	public void add(int value)
	{	
		Node node = new Node(value);
		if(headNode == null)
			headNode =node;
		else
		{
			Node temp = headNode;
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	/**
	 * to display the linked list
	 */
	public void display()
	{
		Node temp = headNode;
		while(temp != null)
		{
			System.out.print(temp.getValue()+"  ");
			temp = temp.next;
		}
	}
	
	/**
	 * to rotate the given sublist in the linklist
	 * @param left left index
	 * @param right right index
	 * @param numberOfRotation rotation factor
	 */
	public void RotateLinkList(int left, int right ,int numberOfRotation)
	{
		Node current = headNode;
		int count = 1;
		int variable;
		Node Left = null;
		Node Right = null;
		Node temp = null;
		Node store = null;
		while(count != right)
		{
			if(count == left)
			{
				store = current;
			}
			current = current.next;
			count++;
		}
		Right = current;
		while(numberOfRotation !=0)
		{
			Left = store;
			variable = store.value;
			while(Left != Right)
			{
				temp = Left;
				Left = Left.next;
				temp.value = Left.value;
			}
			Left.value = variable;
			numberOfRotation--;
		}
	}
}