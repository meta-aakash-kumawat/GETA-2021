package intSet;

public class PolyMain {

	public static void main(String[] args) 
	{	
		int exp[] = {2,2,2};
		polynomial poly = new polynomial(exp);
		
		System.out.println("EXPRESSION VALUE IS "+poly.evaluate(2));
		
		System.out.println("Degree IS "+poly.degree());
		
		
		int a[]={1,1};
		int b[]={2,1};
		int c[]=poly.productOfPolynomial(a, b);
		System.out.println("Product");
		for(int i=0;i<c.length;i++)
			System.out.print("   "+c[i]);
		
	}

}
