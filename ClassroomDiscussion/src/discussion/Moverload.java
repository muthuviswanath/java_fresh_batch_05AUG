package discussion;

public class Moverload {


	char display() {
		return "Muthu".charAt(4);
	}
	
	public static void main(String[] args) {
		Moverload m = new Moverload();
		System.out.println(m.display());
	}

}
