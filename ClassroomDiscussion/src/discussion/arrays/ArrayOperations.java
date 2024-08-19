package discussion.arrays;

public class ArrayOperations {

	static void display(int[] ar) {
		// [el1, el2, el3, .... elen]
		if (ar.length-1 == -1) {
			System.out.println("[]");
		}
		else {
			System.out.print("[");
			for(int i=0; i<ar.length; i++) {
				System.out.print(ar[i]);
				if (i < ar.length-1) {
					System.out.print(", ");
				}
				else {
					System.out.print("]");
				}

			}
		}
	}
}
