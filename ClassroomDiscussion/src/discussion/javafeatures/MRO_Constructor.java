package discussion.javafeatures;

public class MRO_Constructor {
	public static void main(String[] args) {
		MyInterface min = Marker::new;
		min.display("Hello World!");
	}
}
