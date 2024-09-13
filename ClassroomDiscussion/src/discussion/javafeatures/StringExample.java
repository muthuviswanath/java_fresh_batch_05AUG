package discussion.javafeatures;

import java.util.Arrays;

public class StringExample {
	public static void main(String[] args) {
		String[] names = {"Akshith","Muthu","Suman","Ganesh","Subramanya","Jesus","Allah","Buddha"};
		Arrays.sort(names,String::compareToIgnoreCase);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
