
public class PQueueImplementation implements PQueueInterface
{
	int front;
	int rear;
	final int SIZE;
	int queue[];
	
	public PQueueImplementation(int size)
	{
		if(size <= 0)
			throw new AssertionError("Neagtive Size value");
		SIZE = size + 1;
		queue = new int[SIZE];
	}
	
	/**
	 * To insert data in the Priority queue
	 * @param data element to be inserted
	 */
	public boolean insert(int data)
	{
		if( rear >= SIZE -1)
			throw new AssertionError("Queue Overflow");
		if((front == -1) && (rear == -1))
		{
			front++;
			rear++;
			queue[rear] = data;
			return true;
		}
		insertWithPriority(data);
		rear++;
		return true;
	}
	
	/**
	 * To add element according to its priority
	 * @param data to be inserted
	 * @return will return true when insertion is done
	 */
	private boolean insertWithPriority(int data)
	{	
		int i;
		for(i = 0; i <= rear ; i++)
		{
			if( queue[i] <= data)
			{
				for(int j = rear + 1 ; j > i;j--)
				{
					queue[j] = queue[j - 1];
				}
				queue[i] = data;
				return true;
			}
		}
		queue[i] = data;
		return true;
	}
	
	/**
	 * To remove data in the Priority queue
	 * @param data element to be remove
	 */
	public boolean remove(int data)
	{
		if(front == -1 && rear == -1)
			throw new AssertionError("Queue IS Empty");
		for(int i = 0 ; i <= rear; i++)
		{
			if(data == queue[i])
			{
				for(; i < rear ; i++)
				{
					queue[i] = queue[i +1];
				}
			
			queue[i] = -99;
			rear--;
			if(rear == -1)
				front = -1;
			return true;
			}
		}
		return false;
	}
	
	/**
	 * to find the size of the priority queue
	 */
	public int size()
	{
		return rear - front;
	}
	
	/**
	 * to get the top most element
	 */
	public int peek()
	{
		if((front == -1 && rear == -1) || front == rear)
			throw new AssertionError("Queue is empty");
		return queue[front];
			
	}
}
