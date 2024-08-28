package discussion.arrays;

public class ArrayExercise {

	//	1. Create two arrays and merge them into one single array
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {10,20,30,40,50};
		int[] c = new int [a.length + b.length];
		for (int i =0; i<c.length ; i++) {
			if (i<a.length) {
				c[i] = a[i];
			}
			else {
				c[i] = b[i-a.length];
			}
		}
		for(int ele:c) {
			System.out.print(ele +" ");
		}
	}
}
/*
 * 1. Create two arrays and merge them into one single array
 * 2. Create an array and split it into 3 arrays of the size you prefer
 * 3. Enhance the question 2 such that the remaining array size will 
 * 	  be automatically calcualted by the code
 * */
