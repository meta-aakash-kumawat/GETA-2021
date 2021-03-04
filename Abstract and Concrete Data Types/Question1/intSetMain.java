package intSet;

public class intSetMain {

	public static void main(String[] args) 
	{	int SET[]= {11,22,12,45,45};
		intSet set = new intSet(SET);
		
		System.out.println("Ismember  "+ set.isMember(88));
		
		System.out.println("Size "+set.sizeOfSet());
		
		System.out.println("SUBSET");
		int hh[] = {45,22,45,12,11,10};
		System.out.println(set.isSubSetofSet(hh));
		
		System.out.println("UNION");
		int a[] = {1,9,4,6};
		int b[] = {2,7,1,4};
		
		int c[] = set.setUnion(a, b);
		
		for(int i=0;i<c.length;i++)
			System.out.print("  "+c[i]);
		System.out.println();
		System.out.println("COMPLIMENT");
		int d[]= set.setCompliment(a);
		for(int i=0;i<d.length;i++)
			System.out.print("  "+d[i]);
		
		
	}

}
