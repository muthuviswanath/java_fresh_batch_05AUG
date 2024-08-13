package randomnumbers;
import java.util.Random;
public class GenerateRandom {
	public static void main(String[] args) {
		Random r = new Random();
		// Generate a random number without bounds
//		int random_1 = r.nextInt();
//		System.out.println(random_1);
//		
		// Generate a random number with bounds
		System.out.println("Prints random number from 0 to 4");		
		int random_2 = r.nextInt(5)+1;
		System.out.println(random_2);
		
		double d = r.nextDouble(10.5);
		System.out.println(d);
		
		
		
		
	}
}
