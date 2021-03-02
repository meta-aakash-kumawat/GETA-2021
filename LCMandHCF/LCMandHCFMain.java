package recursion;
import static org.junit.Assert.*;

import org.junit.*;
public class LCMandHCFMain 
{

	@Test
	public void LCMShouldReturnVal()
	{
		LCMandHCF obj = new LCMandHCF();
		assertEquals(60,obj.lcm(15, 20));
		assertEquals(75,obj.lcm(25, 3));
	}
	
	@Test
	public void HCFShouldReturnValue()
	{
		LCMandHCF obj = new LCMandHCF();
		assertEquals(5,obj.hcf(10, 15));
		assertEquals(1,obj.hcf(31,2));
	}

}
