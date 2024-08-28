package discussion;
import java.util.ArrayList;

public class ArmstrongNumbers {

    public static boolean isArmstrongNumber(int num) {
        // Convert the number to a string to easily iterate through digits
        String numStr = Integer.toString(num);
        int power = numStr.length();
        int sum = 0;

        for (char d : numStr.toCharArray()) {
            sum += Math.pow(Character.getNumericValue(d), power);
        }

        return num == sum;
    }

    public static ArrayList<Integer> generateArmstrongNumbers(int limit) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();
        int num = 0;

        while (armstrongNumbers.size() < limit) {
            if (isArmstrongNumber(num)) {
                armstrongNumbers.add(num);
            }
            num++;
        }

        return armstrongNumbers;
    }

    public static void main(String[] args) {
        // Define the size of the 2D array
        int rows = 5, cols = 5;
        int limit = rows * cols;

        // Generate Armstrong numbers up to the required limit
        ArrayList<Integer> armstrongNumbers = generateArmstrongNumbers(limit);

        // Create a 6x6 array and fill it with the Armstrong numbers
        int[][] array2D = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = armstrongNumbers.get(i * cols + j);
            }
        }

        // Print the array
        for (int[] row : array2D) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

