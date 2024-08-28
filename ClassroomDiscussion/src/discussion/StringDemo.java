package discussion;

public class StringDemo {
	public static void main(String[] args) {
		
		String name = "Anthology";
		System.out.println("Char at 4th index: " + name.charAt(4));
		
		//If the index is not found, then it will throw an exception
//		System.out.println("Char at 10th index: " + name.charAt(10));
		
		//Find the frequency of a character in a string
		
		String str = "Hello World";
		System.out.println("Length of the strin:" + str.length());
		
		String str1 = "Anthology";
		String str2 = "Anthology";
		String str3 = "anthology";
		String str4 = "anthologe";
		String str5 = new String("Anthology");
		String str6 = new String("Anthology");
		System.out.println("str1 equals str2: " + str1.equals(str2));//true
		System.out.println("str2 equals str3: " + str2.equals(str3));//false
		System.out.println("str3 equals str4: " + str3.equals(str4));//false
		System.out.println("str5 equals str6: " + str5.equals(str6));//true
		System.out.println(str5);
		System.out.println(str6);
		System.out.println("str6 equals str5: " + str6 == str5);//true
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1.equals(emp2));
		
		String str7 = "Hello";
		System.out.println("Go to " + str7.substring(0,4));
		
		//Find the substring of the strings given below
		
//		"Education" - "ducati"
//		"Education" - "cat"
//		"Education" - "ion"
		
		String str8 = "Education";
		System.out.println("It contains ducati: " + str8.contains("ducati"));
	
		String str9 = String.join("|","Bangalore","Chennai","Hyderabad","Mumbai","Goa");
		System.out.println(str9);
		
		String str10 = " ";
		String str11 = "";
		System.out.println("Is str10 empty: " + str10.isEmpty());
		System.out.println("Is str11 empty: " + str11.isEmpty());
		
		String str_new = "Hello World";
		String str_new1 = str_new.replace('l','j');
		System.out.println(str_new1);
		
		String national_song = "Vande Mataram";
		String[] words = national_song.split(" ");
		System.out.println("Words in the national song: " + words.length);
		
		String strong_statement = "God created Humans";
		// You have to perform the task of reversing the 
		// statement which reads as "Humans created God"
		String[] mystmt = strong_statement.split(" ");
		for (int i = mystmt.length-1; i >= 0; i--) {
			System.out.print(mystmt[i]+" ");
		}
		
		String msg = "Hello Suhas";
		String greet = ", welcome to Hell";
		System.out.println(msg.concat(greet));
		
		String greetings = "Hi Jinendra, let start our journey around the Hell for 80 days";
		System.out.println(greetings.indexOf("Jinendra"));
		
		String god = "Evil";
		String good = new String("Evil");
		String demon = god.intern();
		System.out.println("Is god good? "+(god == good));
		System.out.println("Is god evil? "+(god == demon));
	}
}
