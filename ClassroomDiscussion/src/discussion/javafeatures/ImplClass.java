package discussion.javafeatures;

public class ImplClass{

	
	public static void main(String[] args) {
		// Implementing the functional interface using lambda expression
		FunctionalInterfaceDemo fid = 
				(b,g) -> 
					{
					System.out.println("Finding the product of the given number");
					System.out.println(b*g);
					};
		int a = 10;
		int b = 20;
		fid.display(a,b);	
	}
}
