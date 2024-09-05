package discussion.encapsulation;

public class ElectionCommissionApp {
	public static void main(String[] args) {
        VoterIdApp voter = new VoterIdApp("admin", "admin");
        voter.setVoterDetails("HTC8703019","Muthu Venkata Krishnan",40,"Male");
        voter.display();
	}
}
