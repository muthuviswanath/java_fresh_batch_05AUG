
public class GlobalVariables {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	static boolean bool;
	char c;
	String str;
	void display() {
		System.out.println(str);
		System.out.println(bool);
	}
	
	public GlobalVariables() {
		System.out.println(str);
		System.out.println(bool);
	}
	public static void main(String[] args) {
		GlobalVariables g = new GlobalVariables();	
		System.out.println(bool);
	}
}
