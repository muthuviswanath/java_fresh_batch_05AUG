package discussion.collectionframework;

import java.util.ArrayList;

public class Students {
	public static void main(String[] args) {
		ArrayList<String> nlist = new ArrayList<String>();
		nlist.add("Red");
		nlist.add("Blue");
		nlist.add("Green");
		
		ArrayList al = new ArrayList();
		// To add one element after the other
		al.add("John");
		al.add("David");
		System.out.println(al);
		//To insert an element between two elements
		al.add(1, "Scott");
		
		System.out.println(al);
		//To add existing collection into this collection
		al.addAll(nlist);
		System.out.println(al);
		
		//To get a value
		System.out.println(al.get(2));
		
		// To check whether arraylist is empty or not
		System.out.println(al.isEmpty());
		
		// Check whether a specific element is present in the list
		System.out.println(al.contains("John"));
		
		// To find the index of an element
		System.out.println(al.indexOf("Blue"));
		
		// To remove an element
		al.add("SIX");
		al.add(17);
		al.add(7);
		al.add(57);
		System.out.println(al);
		al.remove(Integer.valueOf(7));
		System.out.println(al);
		
		// To update an element
		al.set(2, "Smith");
		System.out.println(al);
	}
}
/*
 * Create a Product class with the following fields:
 * 	       int pid
 *         String pname
 *         double price
 * Create a menu driven code that is used to add the product details to the ArrayList.
 * The menu should have the following options:
 * 		1. Add Product
 *      2. Display Product (Display all the products in the form of table)
 *      the tabluar format should be as follows:
 *          ----------------------------------------------------------------------------------------
 *          Date: 2021-09-01|Time: 10:30:45									
 *          ----------------------------------------------------------------------------------------	
 *          Pid 			| 			Pname 										| Price
 *          ----------------------------------------------------------------------------------------
 *          101 			| 			Mobile 										| 10000
 *          102 			| 			Laptop 										| 50000
 *          103 			| 			Tablet 										| 15000
 *         	----------------------------------------------------------------------------------------
 *          
 * 		3. Update Product
 * 	    4. Delete Product
 * 		5. Exit
 * */
 */