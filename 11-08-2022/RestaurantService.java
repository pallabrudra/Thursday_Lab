package retaurantsystem;

import java.util.Scanner;

public class RestaurantService extends Restaurant {
	
	static Scanner sc = new Scanner(System.in);
	static float s = 0.0f;
	static float sum[] = new float[100];
	static int[] qt = new int[100]; 
	
	//order method
	public static void Order(int ch)
	{
		System.out.println("Enter quantity: ");
		int q=sc.nextInt();
		
		sum[ch-1] += Price[ch-1] * q;  //Calculate Sum of each item based on quantity and put into sum array
		qt[ch-1]+=q; //Store Quantity of each item which have ordered 
		
		
	}

	public static void getAllDetails() 
	{
		
		float GST=32.5f;
	
		for(int i=0;i<sum.length;i++)
		{
			s += sum[i]; // Calculate sum of each item
		
			if(qt[i]!=0)
		     {
	              System.out.println(Name[i]+"\t\t"+qt[i]+"\t\t"+sum[i]);
		     }
			
		}
		
		
		System.out.println("Total: "+s);
		System.out.println("GST: "+GST);
		System.out.println("Net Amount: "+(s+GST));
	}
}


