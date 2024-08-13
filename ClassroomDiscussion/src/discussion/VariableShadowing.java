package discussion;

public class VariableShadowing {
	int age;
	
	public VariableShadowing(int age) {
		this.age = age;
		// this refers to the current invoking object
		// using this keyword, we can avoid variable shadowing
		// Variable Shadowing:
		//	In a class if the global variable and local variable names are same,
		//  while referring the variable name the local variable dominates the
		//  global variable. This is called variable shadowing.
	}
	
	public static void main(String[] args) {
		VariableShadowing s = new VariableShadowing(34);
		System.out.println(s.age);
	}
}
