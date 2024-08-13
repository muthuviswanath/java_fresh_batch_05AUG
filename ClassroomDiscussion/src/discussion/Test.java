package discussion;

public class Test {
	String s;
	Test(){
		this("Str");
	}
	
	Test(String s){
		this(4);
	}
	
	Test(int a) {
		this('c');
	}
	
	Test(char c){
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Test t = new Test();
	}
}
