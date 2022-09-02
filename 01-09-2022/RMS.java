package twentyfive2022;

import java.util.Scanner;

public class RMS extends Customer {
	public static void main(String args[])   
	{ 
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		do {
			System.out.println("----Please select your choice----");
			System.out.println("1) Display Menu \n" + "2) Order Food Item \n"  + "3) Display Order\n" + "4) Pay Bill\n" + "5) Exit\n");
			
			String foodItem="";
			int quantity = 0;
			
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("----MENU----");
				customer.displayMenu();
				break;
			case 2:
				System.out.print("Enter food id to add: ");
				int item = sc.nextInt(); //take food id
				foodItem = customer.Keys.get(item-1); //fetch arraylist item by food id and store it in foodItem
				System.out.print("Enter " + foodItem + "\'s quantity:");
				quantity = sc.nextInt();
				if (customer.orderFood(foodItem, quantity))
					System.out.println(quantity + " " + foodItem + " added in order.");
				else
					System.out.println(foodItem + " does not exist in menu.");
				break;

			case 3:
				System.out.println("Your order is ");
				customer.displayOrder();
				break;
			case 4:
				System.out.println("Your total amount for following order ");
				System.out.println("======================================");
				customer.displayOrder();
				System.out.println("Total Amount(including GST) = " + customer.totalBill());
				System.out.println("-------------------------------------\n");
				break;
			case 5: System.out.println("Have a great Day..."); 
					sc.close();
					System.exit(0);
			default:
				System.out.println("Wrong Input, Please Select appropriate option");
				System.out.println("----------------------------------------------\n");
			}
		}while(true);
				
	
}
}