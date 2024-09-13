package discussion.javafeatures;

public class Welcome {
	static void show(){
		System.out.println("Laptop is a gadget");
	}
	public static void main(String[] args) {
		Test test = Welcome::show;
		test.display();
	}
}
