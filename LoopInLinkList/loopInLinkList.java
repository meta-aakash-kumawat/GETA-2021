
public class loopInLinkList {
	
	
	static class Node
	{
		int data;
		Node next;
		int flag;
	}
	
	/**
	 * To add new node to the link list
	 * @param head link list
	 * @param data value to be stored
	 * @return will return the updated link list
	 */
	static Node push(Node head , int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.flag = 0;
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	/**
	 * To check wheather their is a loop in the link list or not
	 * @param head link list
	 * @return wil  return true and false
	 */
	static boolean detectLoop(Node head)
	{
		while( head != null)
		{
			if(head.flag == 1)
				return true;
			head.flag = 1;
			head = head.next;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Node head = null;
		
		head = push(head ,18);
		head = push(head,88);
		head = push(head,15);
		head = push(head,34);
		
		//head.next.next.next = head;
		
		if(detectLoop(head))
			System.out.println("LOOP FOUND");
		else
			System.out.println("NO LOOP FOUND");
	}

}