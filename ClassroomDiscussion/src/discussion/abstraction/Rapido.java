package discussion.abstraction;

public class Rapido implements GoogleMap, IOSMap, BhuvanMap{

	@Override
	public void displayroute(String src, String destn) {
		System.out.println("Rapido directions from "+src+" to "+destn +"are: ");
		System.out.println("1. Take left from the first signal");
		System.out.println("2. Go straight for 2 kms");
		System.out.println("3. Take right from the second signal");
		System.out.println("4. Go straight for 1 km");
		System.out.println("5. You have reached your destination");
	}

	@Override
	public void showtime(String src, String destn) {
		System.out.println("Rapido time to reach from "+src+" to "+destn +"is: 10 mins");
		
	}
}
