package discussion.javafeatures.timeapi;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DatesDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: " + today);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current date and time: " + now);
		
		//Sat, Sept 07 2024
		DateTimeFormatter formatpattern = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		String formattedDateTime = today.format(formatpattern);
		System.out.println("Formatted date: " + formattedDateTime);
		
		System.out.println("Getting the day from the given date");
		LocalDate date = LocalDate.now();
		System.out.println("Day of the week: " + date.getDayOfWeek());
		
		System.out.println("Getting the day of the from the given date");
		System.out.println("Day of the month: " + date.getDayOfMonth());
		
		System.out.println("Getting the day of the year from the given date");
		System.out.println("Day of the year: " + date.getDayOfYear());
		
		System.out.println("Getting the month from the given date");
		System.out.println("Month:" + date.getMonth());
		
		System.out.println("Getting the month (number) from the given date");
		System.out.println("Month:" + date.getMonthValue());
		
		System.out.println("Getting the Year from the given date");
		System.out.println("Year:" + date.getYear());
	}
}
