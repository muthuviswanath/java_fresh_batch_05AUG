package discussion.inheritance;

import java.util.Scanner;

public class ShoppingCart {
	static Scanner scanner = new Scanner(System.in);
	static String[] productCategories = new String[10];
	static Products[] products;
	public static void main(String[] args) {
		System.out.println("Welcome to the FreshMart Online Store!");
		do {
			System.out.println("Please select from the following options:");
			System.out.println("1. Create Product Category");
			System.out.println("2. Create Product");
			System.out.println("3. Add Product to Cart");
			System.out.println("4. Add Product to Wishlist");
			System.out.println("5. Purchase Product");
			System.out.println("6. Exit");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the product category name:");
				String productCategory = scanner.next();
				for (int i = 0; i < productCategories.length; i++) {
					productCategories[i] = productCategory;
				}
				break;
			case 2:
				System.out.println("Enter the number of products you want to create:");
				int numProducts = scanner.nextInt();
				products = new Products[numProducts];
				for (int i = 0; i < numProducts; i++) {
					Products product = new Products();
					System.out.println("Enter the product ID:");
					product.setProductID(scanner.nextInt());
					System.out.println("Enter the product name:");
					product.setProductName(scanner.next());
					System.out.println("Enter the product price:");
					product.setProductPrice(scanner.nextDouble());
					System.out.println("Enter the product quantity:");
					product.setProductQuantity(scanner.nextInt());
					System.out.println("Enter the product category:");
					for (int j = 0; j < productCategories.length; j++) {
						System.out.println(j + ". " + productCategories[j]);
					}
					String productCat = scanner.next();
					boolean productCatExists = false;
					for (int j = 0; j < productCategories.length; j++) {
						if (productCategories[j].equals(productCat)) {
							product.setProductCategory(productCat);
						}
						else {
							System.out.println("Invalid product category!");
						}
					}
					if (productCatExists) {
						products[i] = product;
					}
					else {
						System.out.println("Product not created!");
					}
					break;

				}

			}
		} while(true);
	}
}
