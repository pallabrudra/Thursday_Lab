package twentyfive2022;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Set;

public class Bill {

	HashMap<String, Float> menu = new HashMap<String, Float>();
	

	ArrayList<String> addItem() {
		// Add Menu to hashmap
		menu.put("Chicken Momo",100.0f );
		menu.put("Biriyani",200.0f );
		menu.put("Chinise",250.0f );
		menu.put("Chicken Chap",150.0f );
		
		// Creating an ArrayList of keys by passing the keySet
	    ArrayList<String> listOfKeys = new ArrayList<String>(menu.keySet());
	    return listOfKeys;
		
	}



	void displayMenu() {
	
		Set<String> foodNames = menu.keySet();
		int i=0;
		System.out.println("-------------------------------------");
		System.out.println("FOOD \t\t\t\t PRICE");
		System.out.println("-------------------------------------");
		for (String food : foodNames) //fetch hashmap and print the key and values 
		{
			System.out.println(++i +")"+food + "\t\t\t" + menu.get(food));
		}
		System.out.println("-------------------------------------");
	}
}
