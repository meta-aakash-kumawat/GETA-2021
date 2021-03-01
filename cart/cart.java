package cart;

import java.util.ArrayList;
import java.util.Scanner;

public class cart
{
	public static String items[]=new String[10];
	public static int price[]=new int[10];
	public static int pId[]=new int[10];
	public static void main(String args[])
	{
		
		for(int i = 0; i < 10; i++)
		{
			items[i] = "Product" + (i + 1);
			price[i] = 100 + i * 10;
			pId[i] = i + 1;
		}

		ArrayList<Integer> arr =  new ArrayList<Integer>();
		ArrayList<Integer> qty = new ArrayList<Integer>(); 
		System.out.println("Product Id   Product   Price");
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println(pId[i]+"   "+items[i]+"  "+price[i]);
		}
		while(true)
		{
			int val;
			System.out.println("Press 1--> to add item in cart\n"
				+ "Press 2-->to modify item qty\n"
				+ "Press 3-->to remove item\n"
				+ "Press 4--> to get bill\n"
				+ "Press 5-->to exit");
			Scanner in = new Scanner(System.in);
			val = in.nextInt();
			if(val == 1)
			{
				System.out.print("Enter the product code\n ");
				int pp;
				pp = in.nextInt();
				arr.add(pp);
				System.out.print("Enter the quantity \n");
				int qq;
				qq = in.nextInt();
				qty.add(qq);	
			}
			else if(val == 3)
			{
				System.out.print("Enter the product code to be remove \n");
				int pp = in.nextInt();
				int i;
				for(i = 0; i < arr.size(); i++)
				{
					if(arr.get(i) == pp)
					{
						break;
					}
				}
				arr.remove(i);
				qty.remove(i);
				System.out.println("REMOVED SUCCESSFULLY>>!!");
			}
			else if(val == 2)
			{
				System.out.print("Enter the product code whose quantity to be modify\n ");
				int kk = in.nextInt();
				int i;
				System.out.print("Enter the correct qty\n ");
				int qq = in.nextInt();
				for(i = 0; i < arr.size(); i++)
				{
					if(arr.get(i) == kk)
					{
						break;
					}
				}
				qty.set(i,qq);
				System.out.println("MODIFIED SUCCESFULLY>>!!");
				
			}
			else if(val == 4)
			{	
				System.out.println("YOUR BILL IS>>>\n"
						+ "==================\n");
				System.out.println("Item      Price    quantity  total");
				int sum = 0;
				for(int i = 0; i < arr.size(); i++)
				{
					int p = getPrice(arr.get(i));
					sum = sum + qty.get(i) * p;
					System.out.println(getProduct(arr.get(i))+"     "+p+"    "+qty.get(i)+"        "+qty.get(i)*p);
				}
				System.out.println("===========================>>"+sum);
				System.exit(0);
			}
			else 
				System.exit(0);
			in.close();
		}
	
	}
	public static int getPrice(int ID)
	{	int  i;
		for(i = 0; i < 10; i++)
		{
			if(ID == pId[i])
				break;
		}
		return price[i];
	}
	public static String getProduct(int ID)
	{	int  i;
		for(i = 0; i < 10 ; i++)
		{
			if(ID == pId[i])
				break;
		}
		return items[i];
	}
	
}
