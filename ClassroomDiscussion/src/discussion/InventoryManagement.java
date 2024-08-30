package discussion;

import java.util.Scanner;

public class InventoryManagement {

	Product[] products;
	static Scanner scan = new Scanner(System.in);
	public void addProduct(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Enter the product id: ");
			int id = scan.nextInt();
			System.out.println("Enter the product name: ");
			String name = scan.next();
			System.out.println("Enter the product price: ");
			double price = scan.nextDouble();
			products[i] = new Product(id, name, price);
		}

	}

	public void orderProduct() {
		System.out.println("List of available products:");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].name);
		}
		System.out.println("Order your product:");
		System.out.println("Enter the product id : ");
		int id = scan.nextInt();
		System.out.println("Enter the quantity: ");
		int quantity = scan.nextInt();
		for (int i = 0; i < products.length; i++) {
			if (products[i].id == id) {
				products[i].quantity = quantity;	
			}
		}
	}
	public void displayProduct() {
		double total = 0;
		System.out.println("-----------------------------------------------------------------------");
		System.out.print(String.format("%-20s", "Date: 16-Aug-2024"));
		System.out.print(String.format("%25s", "CAMLIN INDIA PVT LTD"));
		System.out.print(String.format("%20s", "INV NO: 387432\n"));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Item.No\tProduct\t\t\tPrice\t\tQuantity\tTotal");
		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < products.length; i++) {
			Product product = products[i];
			System.out.print(String.format("%-8s", product.id));
			System.out.print(String.format("%-24s", product.name));
			System.out.print(String.format("%-16s", product.price));
			System.out.print(String.format("%-15s", product.quantity));
			System.out.print(String.format("%-14s", product.price * product.quantity));
			total += product.price * product.quantity;
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.print(String.format("%50s", "Total"));
		System.out.print(String.format("           %10.2f", total));
		double gst = total * 0.18;
		System.out.println();
		System.out.print(String.format("%50s", "(+) GST"));
		System.out.print(String.format("           %10.2f", gst));
		System.out.println();
		System.out.print(String.format("%50s", "(-) Discount"));
		System.out.print(String.format("           %10.2f", 10.0));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.print(String.format("%50s", "Total Amount"));
		System.out.print(String.format("           %10.2f", total + gst - 5670.0));
		System.out.println("\n-----------------------------------------------------------------------");

	}

	public static void main(String[] args) {

		InventoryManagement inventory = new InventoryManagement();
        System.out.println("Choose your options: ");
        do {
        	System.out.println("1. Add product");
        	System.out.println("2. Order product");
        	System.out.println("3. Display product");
        	System.out.println("4. Exit");
        	int choice = scan.nextInt();
        	switch(choice) {
			case 1:
				System.out.println("Enter the number of products: ");
				int count = scan.nextInt();
				inventory.products = new Product[count];
				inventory.addProduct(count);
				break;
			case 2:
				inventory.orderProduct();
				break;
			case 3:
				inventory.displayProduct();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
        	}
        	
        }while(true);
        
	}
}


