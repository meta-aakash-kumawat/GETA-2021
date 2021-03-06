package cart;

import java.util.ArrayList;
import java.util.Scanner;

public class Shoppingcart
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
		ArrayList<Integer> quantityOfProducts = new ArrayList<Integer>(); 
		System.out.println("Product Id   Product   Price");
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println(pId[i]+"   "+items[i]+"  "+price[i]);
		}
		Scanner in = new Scanner(System.in);

		while(true)
		{
			int val;
			System.out.println("Press 1--> to add item in cart\n"
				+ "Press 2-->to modify item quantityOfProducts\n"
				+ "Press 3-->to remove item\n"
				+ "Press 4--> to get bill\n"
				+ "Press 5--> to display cart\n"
				+ "Press 6-->to exit");
			val = in.nextInt();
			switch(val)
			{
				case 1:
				{
					System.out.print("Enter the product code\n ");
					int prouductCode;
					prouductCode = in.nextInt();
					if(prouductCode < 1 || prouductCode > 10)
					{
						System.out.println("Invalid Product code Enter Again ");
						prouductCode = in.nextInt();
					}
					arr.add(prouductCode);
					System.out.print("Enter the quantity \n");
					int quantity;
					quantity = in.nextInt();
					quantityOfProducts.add(quantity);	
					break;
				}
				case 3:
				{
					System.out.print("Enter the product code to be remove \n");
					int productCode = in.nextInt();
					if(validateProductId(productCode , arr))
					{	int i;
						for(i = 0; i < arr.size(); i++)
						{
							if(arr.get(i) == productCode)
							{
								break;
							}
						}
						arr.remove(i);
						quantityOfProducts.remove(i);
						System.out.println("REMOVED SUCCESSFULLY>>!!");
					}
					else
						System.out.println("Product not found in your cart");
					break;
				}
				case 2:
				{
					System.out.print("Enter the product code whose quantity to be modify\n ");
					int productCode = in.nextInt();
					if(validateProductId(productCode , arr))
					{	int i;
						System.out.print("Enter the correct quantityOfProducts\n ");
						int quantity = in.nextInt();
						for(i = 0; i < arr.size(); i++)
						{
							if(arr.get(i) == productCode)
							{
								break;
							}
						}
						if(quantity == 0)
						{
							arr.remove(i);
							quantityOfProducts.remove(i);
						}
						else
						{
							quantityOfProducts.set(i,quantity);
							System.out.println("MODIFIED SUCCESFULLY>>!!");
						}
					}
					else
						System.out.println("Product not found in the cart");
					break;
					
				}
				case 4:
				{	
					System.out.println("YOUR BILL IS>>>\n"
							+ "==================\n");
					System.out.println("Item      Price    quantity  total");
					int sum = 0;
					for(int i = 0; i < arr.size(); i++)
					{
						int p = getPrice(arr.get(i));
						sum = sum + quantityOfProducts.get(i) * p;
						System.out.println(getProduct(arr.get(i))+"     "+p+"    "+quantityOfProducts.get(i)+"        "+quantityOfProducts.get(i)*p);
					}
					System.out.println("===========================>>"+sum);
					break;
				}
				case 5:
				{
					System.out.println("==================\n");
					System.out.println("Item      Price    quantity  total");
					for(int i = 0; i < arr.size(); i++)
					{
						int p = getPrice(arr.get(i));
						System.out.println(getProduct(arr.get(i))+"     "+p+"    "+quantityOfProducts.get(i)+"        "+quantityOfProducts.get(i)*p);
					}
					System.out.println("===========================");
					break;
				}
				default:
					System.exit(0);
				
			}
		}
		
	}
	public static boolean validateProductId(int pID,  ArrayList<Integer> arr)
	{	
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i) == pID)
			{
				return true;
			}
		}
		return false;
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
