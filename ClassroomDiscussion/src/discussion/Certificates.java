package discussion;

public class Certificates {
	String dateofbirth;
	String dateofgraduation;
	String college;
	String dateofdeath;
	String natureofdeath;
	String timeofdeath;
	static String dob = "16-May-1984";
	public Certificates(String dateofbirth) {
		super();
		this.dateofbirth = dateofbirth;
		System.out.println("Muthu was born on: " + this.dateofbirth);
	}
	
	public Certificates(String dateofgraduation, String college) {
		this(dob);
		this.dateofgraduation = dateofgraduation;
		this.college = college;
		System.out.println("Muthu completed his graduation on :" + this.dateofgraduation +" in " + this.college);
	}
	
	public Certificates(String dateofdeath, String natureofdeath, String timeofdeath) {
		this("23-June-2003","IIT");
		this.dateofdeath = dateofdeath;
		this.natureofdeath = natureofdeath;
		this.timeofdeath = timeofdeath;
		System.out.println("It was very fortunate that he died on " + this.dateofdeath + " due to " + this.natureofdeath + " " + this.timeofdeath);
	}
	public static void main(String[] args) {
		Certificates death = new Certificates("15-Aug-2024", "mosquito bite", "Exactly at 12:00 AM");
		String s = """ 
					Test """;
		
	}
	
}
