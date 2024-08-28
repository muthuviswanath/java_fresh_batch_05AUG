package discussion;

public class StringFormatting {
/**
 * %a - Floating point (except BigDecimal) - Returns Hex output of floating point number
 * %b - Any type - "true" if non-null, "false" if null
 * %c - Character - Unicode character
 * %d - Integer - Decimal integer
 * %e - Floating point - Decimal number in scientific notation
 * %f - Floating point - Decimal number
 * %g - Floating point - Decimal number, possibly in scientific notation depending on the precision and value.
 * %h - Any type - Hex String of value from hashCode() method.
 * %n - None - Platform-specific line separator
 * %o - Integer - Octal number
 * %s - String - String value
 * %t - Date/Time - %t is the prefix for Date/Time conversions. More formatting flags are needed after this.
 * %x - Integer - Hex string.
 * 
 * */
	
	public static void main(String[] args) {
		Candidate c1 = new Candidate("John");
		Candidate c2 = new Candidate("Abraham");
		Candidate c3 = new Candidate("Smith");
		Candidate c4 = new Candidate("Doe");
		Candidate[] candidates = {c1,c2,c3,c4};
		
		for (Candidate candidate : candidates) {
			System.out.print(String.format("%-15s", candidate.name));
			System.out.print(String.format("%5d",15));
			System.out.println();
		}
	}
}

class Candidate{
	
	String name;
	
	public Candidate(String name) {
		this.name = name;
	}
}