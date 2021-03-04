
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void rotateSublistResult(){
		RotateSubList list = new RotateSubList();
		list.add(new Node(8));
		list.add(new Node(5));
		list.add(new Node(22));
		list.add(new Node(47));
		list.add(new Node(57));
		list.add(new Node(74));
		list.add(new Node(99));
		list.add(new Node(23));
		int expected[] = {8, 57, 47, 5,22, 74, 99, 23};
		list.rotateSubList(2, 5, 2);
		assertArrayEquals(expected, list.toArray());
	}
	
	

}