package retaurantsystem;

import java.util.Scanner;
public class RestaurantMain {

	public static void main(String[] args) {
		int ch;
		char ca;
		Scanner sc=new Scanner(System.in);
		RestaurantService bservice=new RestaurantService();
		System.out.println("~~Welcome to bekar restaurant system~~");
		System.out.println("====================================");
		System.out.println("\n1.Biriyani\t\t200.0\n2.Chinise Combo\t\t250.0"
			+ "\n3.Bada Platter\t\t200.0\n4.Dhosa Platter\t\t350.0");
		
		
		do {

		System.out.println("Enter Food Id: ");
		ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				bservice.Order(ch); // Call the order method of RestaurantService class
				break;
			case 2:	
				bservice.Order(ch);
				break;
			case 3:	
				bservice.Order(ch);
				break;
			case 4:	
				bservice.Order(ch);
				break;
			}
		System.out.println("Continue Billing Process y/n: ");
		ca=sc.next().charAt(0);
		
		
		}while(ca != 'n'); 
		System.out.println("*******************************************");
		bservice.getAllDetails(); // Print the Price, quantity, Total of ordered item(s)
		System.out.println("Thanks for visit us");
		
	}
}
