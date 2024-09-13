package discussion.javafeatures;

@FunctionalInterface
public interface MyInterface {
	Marker display(String message);
}

class Marker {
	public Marker(String message) {
		System.out.println(message);
	}
}