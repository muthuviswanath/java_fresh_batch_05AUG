package discussion.javafeatures.timeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateManipulation {
	public static void main(String[] args) {
		LocalDate christmas = LocalDate.of(2024, 12, 25);
		System.out.println("Christmas: " + christmas);
		
		LocalDate today = LocalDate.of(2024,1,1);
		LocalDate end = LocalDate.of(2024,1,31);
		
		System.out.println("Today is after end: " + today.isAfter(end));
		System.out.println("End is before today: " + end.isBefore(today));
		
		System.out.println(today.compareTo(end));
		System.out.println(end.compareTo(today));
		
		Period period = Period.between(today, end);
		System.out.println("Differnece is: " + period.getYears() + " years, " 
		+ period.getMonths() + " months, " + period.getDays() + " days");

	}
}
