import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class guentherMarket {

	public static void main(String[] args) {

		
		// foodTracker.put
		Scanner scnr = new Scanner(System.in);
		String pickedProduce;
		String yesNo;
		ArrayList<String> produce = new ArrayList<String>();
		ArrayList<Double> price = new ArrayList<Double>();
		
		
		HashMap <String, Double>foodTracker = new HashMap <>();
		foodTracker.put("pineapple",4.99);
		foodTracker.put("mango",1.50);
		foodTracker.put("coconut", 4.49);
		foodTracker.put("peach",0.99);
		foodTracker.put("broccoli", 1.09);
		foodTracker.put("banana", 0.50);
		foodTracker.put("green beans",3.99);
		foodTracker.put("apple", 0.99);

	

		System.out.println("Welcome to Guenther's Market!");
		
		while(true) {
			try {
				System.out.println("");
				menuHead();
				menuFood();
		
				System.out.print("\n" + "What item would you like to order? ");
				pickedProduce = scnr.nextLine().trim().toLowerCase();
				
				boolean userEntry = foodTracker.containsKey(pickedProduce);
				if(userEntry == false) {
					throw new RuntimeException ();
					
				}
				
				//int indexPlease = foodTracker.indexOf(pickedProduce);
		
				System.out.printf("Adding " + pickedProduce + " to cart at $" +"%.2f", foodTracker.get(pickedProduce));
				
				//change to ArrayList
				//produce.get(pickedProduce, price.get(indexPlease));
		
				System.out.print("\n" +"\n"+ "Would you like to order anything else (y/n)? ");
				yesNo = scnr.nextLine().trim().toLowerCase();
				
				if (yesNo.equals("n")) {
					break;
				}
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		} 
		
		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got: ");
		
		//need to actually pass arraylist to method, not map ughhhhhhhhhhhh
		finalList(foodTracker);
		
	}

	public static void menuHead() {
		System.out.printf("%-15s", "Item");
		System.out.println("Price");
		System.out.println("============================");
	}

	public static void menuFood() {
		System.out.printf("%-15s", "pineapple");
		System.out.println("$4.99");
		System.out.printf("%-15s", "mango");
		System.out.println("$1.50");
		System.out.printf("%-15s", "coconut");
		System.out.println("$4.49");
		System.out.printf("%-15s", "peach");
		System.out.println("$0.99");
		System.out.printf("%-15s", "broccoli");
		System.out.println("$1.09");
		System.out.printf("%-15s", "banana");
		System.out.println("$0.50");
		System.out.printf("%-15s", "green beans");
		System.out.println("$3.99");
		System.out.printf("%-15s", "apple");
		System.out.println("$0.99");
	}
	//Needs to use the parallel arraylist instead
	public static void finalList(HashMap<String,Double> map) {
		for (String key: map.keySet()) {
			System.out.printf("%-15s",key );
			System.out.print( map.get(key) +"\n" );
			
		}
	//}
	//public void double average()
//}

	//public static void
		
}
	
}