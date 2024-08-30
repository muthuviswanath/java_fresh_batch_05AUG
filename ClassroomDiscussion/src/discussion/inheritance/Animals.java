package discussion.inheritance;

public class Animals {

	void eat() {
		System.out.println("eating...");
	}

	void makeNoise() {
		System.out.println("making noise...");
	}
}

class Lion extends Animals {
	void smile() {
		System.out.println("Lion smiles...");
	}
	
	void makeNoise() {
		System.out.println("roar...");
	}
	
	void eat() {
		System.out.println("eating meat...");
	}
}

class Tiger extends Animals {

	void smile() {
		System.out.println("Tiger smiles...");
	}
	
	void makeNoise() {
		System.out.println("growl...");
	}

	void eat() {
		System.out.println("eating meat...");
	}
}
