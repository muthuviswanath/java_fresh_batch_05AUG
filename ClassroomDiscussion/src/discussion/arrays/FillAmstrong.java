package discussion.arrays;

public class FillAmstrong {
	/**
	 * Create a method to calculate the power of a number
	 * Create a method to calculate the number of digits in a number
	 * Create a method to check if a number is an Armstrong number
	 * Create a method to fill an array with Armstrong numbers
	 *  
	 * */

	/**
	 * This method calculates the power of a number
	 */
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

	/**
	 * This method calculates the number of digits in a number
	 */

	public static int numberOfDigits(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	/**
	 * This method checks if a number is an Armstrong number
	 */

	public static boolean isArmstrong(int number) {
		int sum = 0;
		int temp = number;
		int digits = numberOfDigits(number);
		while (temp > 0) {
			int remainder = temp % 10;
			sum += power(remainder, digits);
			temp /= 10;
		}
		return sum == number;
	}

	/**
	 * This method fills an array with Armstrong numbers
	 */

	public static void fillArmstrong(int[] array) {
		int count = 0;
		int number = 1;
		while (count < array.length) {
			if (isArmstrong(number)) {
				array[count] = number;
				count++;
			}
			number++;
		}
	}

	/**
	 * This method prints the elements of an array
	 */

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[10];
		fillArmstrong(array);
		printArray(array);
	}
}



