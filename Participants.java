
public class Participants {

	String name;
	String course;
	PentagonSpace ps;
	public Participants(String name, String course, PentagonSpace ps) {
		this.name = name;
		this.course = course;
		this.ps = ps;
	}
	
	void display() {
		System.out.println(this.name +" is enrolled for the course " + this.course
							+ "in Pentagon Space at the following address:\n"+ this.ps.city 
							+", "+ this.ps.State+", "+ this.ps.Country);
							
	}
	
	public static void main(String[] args) {
		PentagonSpace ps = new PentagonSpace();
		ps.city = "Bengaluru";
		ps.State = "Karnataka";
		ps.Country = "Bharath";
		
		Participants p1 = new Participants("Muthu", "Java Full Stack", ps);
		p1.display();
		p1 = null;
		//p1.display();
		System.out.println(ps.city);
		System.out.println(ps.State);
		System.out.println(ps.Country);
	}
}


class PentagonSpace{
	String city;
	String State;
	String Country;
}