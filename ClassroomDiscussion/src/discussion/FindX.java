package discussion;
import java.util.Scanner;

public class FindX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of y: ");
		int y = scanner.nextInt();
		boolean found = false;
		for (int k = 1; k <= 30; k++) { 
			int powerOfTwo = 1 << k; 
			int result = k * powerOfTwo;
			if (result == y) {
				System.out.println("2^" + y + " can be expressed as " + powerOfTwo + "^"+ powerOfTwo);
				found = true;
				break; 
			}
		}
		if (!found) {
			System.out.println("Cannot express 2^" + y + " as x^x.");
		}
		scanner.close();
	}
}