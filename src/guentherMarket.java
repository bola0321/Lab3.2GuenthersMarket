import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class guentherMarket {

	public static void main(String[] args) {
		
		//HashMap <String, Double>foodTracker = new HashMap <>();
		//foodTracker.put
		Scanner scnr = new Scanner(System.in);
		String pickProduce;
		String yesNo;
		
		ArrayList <String> produce = new ArrayList<String>();
		produce.add("pineapple");
		produce.add("mango");
		produce.add("coconut");
		produce.add("peach");
		produce.add("broccoli");
		produce.add("banana");
		produce.add("green beans");
		produce.add("apple");
		
		ArrayList <Double> price = new ArrayList<Double>();
		price.add (4.99);
		price.add(1.50);
		price.add(4.49);
		price.add(0.99);
		price.add(1.09);
		price.add(0.50);
		price.add(3.99);
		price.add(0.99);
		
		System.out.println("Welcome to Guenther's Market!" + "\n");
		menuHead();
		menuFood();
		
		System.out.print("\n" + "What item would you like to order? ");
		pickProduce = scnr.nextLine().trim().toLowerCase();
		//TODO:check each name of selection and make a tally (use switch and default to show error)
		
		
		
		System.out.print("\n"+ "Would you like to order anything else (y/n)?");
		yesNo = scnr.nextLine().trim().toLowerCase();
		
		
	}

	public static void menuHead() {
		System.out.printf("%-15s", "Item");
		System.out.println("Price");
		System.out.println("============================");
	}

	public static void menuFood() {
		System.out.printf("%-15s","pineapple");
		System.out.println("$4.99");
		System.out.printf("%-15s","mango");
		System.out.println("$1.50");
		System.out.printf("%-15s","coconut");
		System.out.println("$4.49");
		System.out.printf("%-15s","peach");
		System.out.println("$0.99");
		System.out.printf("%-15s","broccoli");
		System.out.println("$1.09");
		System.out.printf("%-15s","banana");
		System.out.println("$0.50");
		System.out.printf("%-15s","green beans");
		System.out.println("$3.99");
		System.out.printf("%-15s","apple");
		System.out.println("$0.99");
	}

	public void double average()
}
