public class LinkedListTest {

	public static void main(String args[])
	{
		RotateSubList list = new RotateSubList();
		list.add(8);
		list.add(5);
		list.add(22);
		list.add(47);
		list.add(57);
		list.add(74);
		list.add(99);
		list.add(23);
		list.display();
		list.RotateLinkList(2, 5, 2);
		System.out.println();
		list.display();
	}
	
	

}