import static org.junit.Assert.*;

import org.junit.Test;


public class MultiVariantTest 
{
	@Test
	public void testPoly()
	{	
		// 2(x^2y^3z^4) + 3(xy^2z) + 5(xyz)
		int coff[] ={2,3,5};
		int exponent [][] = {{2,3,4},
							 {1,2,1},
							 {1,1,1}};
		
		MultiVariantPolynomial list = new MultiVariantPolynomial();
		list.helper(coff, exponent);
		
		int result = list.degree();
		assertEquals(9,result);
		
	}
}
