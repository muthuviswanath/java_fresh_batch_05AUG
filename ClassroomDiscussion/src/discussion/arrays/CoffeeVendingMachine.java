package discussion.arrays;

import java.util.Scanner;

public class CoffeeVendingMachine{
	/**

	 * Create a menu driven code for a coffee vending machine that calculates the total once the coffee is dispensed 
	 *	  1. Cappuccino - 100
	 *    2. Espresso - 150
	 *    3. Latte - 200
	 *    4. Mocha - 250
	 *    5. Americano - 300
	 *    6. Exit
	 */

	/**
	 * This method calculates the total cost of the coffee
	 */
	public static int totalCost(int choice) {
		switch (choice) {
		case 1:
			return 100;
		case 2:
			return 150;
		case 3:
			return 200;
		case 4:
			return 250;
		case 5:
			return 300;
		default:
			return 0;
		}
	}
	/**
	 * This method displays the menu
	 */
	public static void displayMenu() {
		System.out.println("1. Cappuccino - 100");
		System.out.println("2. Espresso - 150");
		System.out.println("3. Latte - 200");
		System.out.println("4. Mocha - 250");
		System.out.println("5. Americano - 300");
		System.out.println("6. Exit");

	}
	
	/**
	 * This method dispenses the coffee
	 */
	
	public static void dispenseCoffee(int choice) {
		switch (choice) {
        case 1:
            System.out.println("Cappuccino dispensed");
            break;
        case 2:
            System.out.println("Espresso dispensed");
            break;
        case 3:
            System.out.println("Latte dispensed");
            break;
        case 4:
            System.out.println("Mocha dispensed");
            break;
        case 5:
            System.out.println("Americano dispensed");
            break;
        default:
            System.out.println("Invalid choice");
        }
    }
	
	public static void main(String[] args) {
		int total = 0;
		Scanner s = new Scanner(System.in);
		while (true) {
			displayMenu();
			System.out.println("Enter your choice");
			int choice = s.nextInt();
			if (choice == 6) {
				break;
			}
			int cost = totalCost(choice);
			if (cost == 0) {
				System.out.println("Invalid choice");
			} else {
				total += cost;
				dispenseCoffee(choice);
			}
		}
		System.out.println("Total cost: " + total);
	}
	
}