
public class marksheetMain {

	public static void main(String[] args) {

		Marksheet m = new Marksheet();
		int gg[][]={{77, 88,89},{67,88,59},{99,67,44}};
		int k[]=m.average( gg, 3 );
		for(int i=0;i<k.length;i++)
			System.out.print("  "+k[i]);
		System.out.println();

		int kk[]=m.maxOfGrades( gg, 3 );
		for(int i=0;i<k.length;i++)
			System.out.print("  "+kk[i]);
		System.out.println();

		int kkk[]=m.minOfGrades( gg, 3 );
		for(int i=0;i<k.length;i++)
			System.out.print("  "+kkk[i]);
		System.out.println();
		float l[]=m.percentage(gg,3);
		for(int i=0;i<k.length;i++)
			System.out.print("  "+l[i]);
		

	}

}
