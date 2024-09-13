package discussion.collectionframework;

public class TestGenerics {
	public static void main(String[] args) {
		Generics<String> g = new Generics();
		g.setEmpno("Emp101");
		g.display();
		Generics g2 = new Generics();
		g2.setEmpno(1234);
		g2.display();
		
	}
}
