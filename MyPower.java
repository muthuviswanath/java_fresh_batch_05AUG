// Write the algorithm (steps) to get two numbers from the user and raise one number to the power of
// another number
// Example
/*
	Enter the first number: 2
	Enter the second number: 7

	2 raised to the power of 7 is : 128
*/
import java.util.Scanner;
class  MyPower
{
	int getExponent(int fnum, int snum){
		int res = 1;
		for (int i=1;i<=snum ;i++ )
		{
			res = res * fnum;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		MyPower mp = new MyPower();
		System.out.println("Enter the first number: ");
		int fnum = s.nextInt();
		System.out.println("Enter the second number: ");
		int snum = s.nextInt();

		int result = mp.getExponent(fnum, snum);
		System.out.println(fnum + " raised to the power of " + snum + " is : "+ result);
	}
}
