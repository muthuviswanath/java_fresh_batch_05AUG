package discussion.arrays;
import java.util.Scanner;
public class FillPrime {
	static boolean isPrime(int n) {
		int factor = 0;
		for (int i=1;i<=n;i++) {
			if(n%i == 0) {
				factor ++;
			}
		}
		if (factor == 2)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array that needs to be filled with prime numbers: ");
		int size = s.nextInt();
		int prime_arry[] = new int[size];

		int count = 0;
		int pnum = 2;
		while(count < size) {
			if(isPrime(pnum)) {
				prime_arry[count] = pnum;
				count++;
			}
			pnum++;
		}
		for(int ele:prime_arry) {
			System.out.println(ele);
		}
	}
}
