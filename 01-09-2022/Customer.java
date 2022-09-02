package twentyfive2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Customer extends Bill {
	HashMap<String, Integer> order = new HashMap<String, Integer>(); //"order" HashMap to store the food items and its quantity ordered by customer.
	ArrayList<String> Keys = new ArrayList<String>();
	double gst=17.25;
	Customer()
	{
		Keys=super.addItem(); //All Menu item saved to arraylist Keys
	}
	void displayMenu() 
	{
		super.displayMenu();
	}
	
	boolean orderFood(String food, int quantity) {
		/*
		 * Check if the menu contains the food item ordered by the customer. If it does
		 * not exist in menu return false, else add the food item in customer's order.
		 */
		if (!super.menu.containsKey(food))
			return false;
		order.put(food, quantity);
		return true;

	}
	
	void displayOrder() 
	{
		/*
		 * Check if the order HashMap is empty. If its empty then return, else display
		 * all the food items and its quantity ordered by customer.
		 */
		if (order.isEmpty()) {
			System.out.println("No items in order.");
			return;
		}
		Set<String> foodNames = order.keySet();
		System.out.println("-------------------------------------");
		System.out.println("FOOD \t QUANTITY \t PRICE \t TOTAL");
		System.out.println("-------------------------------------");
		for (String food : foodNames) {
			System.out.println(food + "  \t" + order.get(food) + "\t" + menu.get(food) + "\t"
					+ super.menu.get(food) * order.get(food));
		}
		System.out.println("-------------------------------------\n");
	}



	double totalBill() {
		/*
		 * calculate the total amount for the food items ordered including GST (Return gst+amount).
		 */
		double amount = 0;
		Set<String> foodNames = order.keySet();
		for (String food : foodNames) {
			amount += (super.menu.get(food) * order.get(food));
		}
		return amount + gst;
	}
}