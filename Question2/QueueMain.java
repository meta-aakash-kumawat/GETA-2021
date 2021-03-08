package Question2;

import java.util.Scanner;

public class QueueMain 
{
static QueueImplementation queue = new QueueImplementation();
	
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the queue elemtnts ");
		int x = 0;
		do 
		{
			System.out.println("Please enter the element : ");
			int ele = sc.nextInt();
			queue.enqueue(ele);
			System.out.println("Want to enter more elements : Press\n1 : Yes\t\tOther : No");
			x = sc.nextInt();
		} while(x==1);
		
		while(x != 1)
		{
			System.out.println("\nSelect which operation you want to perform :");
			System.out.println("1. Enqueue element");
			System.out.println("2. Dequeue element");
			System.out.println("3. Check whether queue is full or not");
			System.out.println("4. Check whether queue is empty or not");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the element : ");
				int val = sc.nextInt();
				queue.enqueue(val);
				break;
			case 2:
				val = queue.dequeue();
				System.out.println("Element " + val + " has been deleted");
				break;
			case 3:
				Boolean value = queue.isFull();
				if( value ) {
					System.out.println("Queue is Full");
				} else {
					System.out.println("Queue is not Full");
				}
				break;
			case 4:
				value = queue.isEmpty();
				if( value ) {
					System.out.println("Queue is Empty");
				} else {
					System.out.println("Queue is not Empty");
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid choice");
				break;
			}
		}
		sc.close();
	}
}