//19-Aug-2024
package discussion.arrays;

import java.util.Scanner;

public class ArraysDemo {
	public static void main(String[] args) {
		// Declaring array or Array creation

		/*
		 * Early Initialization
		 * datatype [] array_variable_name = {ele1,ele2,...}
		 * int[] ar = {1,2,3,4};
		 * 
		 * Late Initialization
		 * datatype [] array_variable_name = new datatype[size]
		 * int[] ar = new int[10];
		 * */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		int size = scan.nextInt();
//		int[] myarr = new int[size];
//		for (int index = 0; index <size;index++) {
//			System.out.println("Enter the value for element " + (index+1)+" : ");
//			myarr[index] = scan.nextInt();
//		}
//		
//		System.out.println("\nIterating the array using while loop");
//		int i = 0;
//		while(i<size) {
//			System.out.print(myarr[i++] +" ");
//		}
//		
//		System.out.println("\nIterating the array using do-while loop");
//		int j = 0;
//		do {
//			System.out.print(myarr[j++] +" ");
//		}while(j<size);
//
//		System.out.println("\nIterating the array using for loop");
//		for(int k = 0;k<size;k++)
//		{
//			System.out.print(myarr[k] +" ");
//		}
//		
//		System.out.println("\nIterating the array using enhanced for loop");
//		for(int ele:myarr)
//		{
//			System.out.print(ele+" ");
//		}
//		System.out.println();
		
		int your_arr[] = {};
		ArrayOperations.display(your_arr);

	}
}
