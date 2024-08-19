package discussion;

public class Alpha {
	static Alpha al;
	String msg = "Appearances are always deceptive";
	public Alpha() {
		Beta b = new Beta();
	}
	public static void main(String[] args) {
		al = new Alpha();
	}
}
