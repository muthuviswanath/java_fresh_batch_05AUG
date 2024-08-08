
public class Cow {

	Milk gives (Hay h, Water w) {
		Milk m = new Milk();
		return m;
	}

	public static void main(String[] args) {
		Cow c = new Cow();
		Hay h = new Hay();
		Water w = new Water();
		Milk mlk = c.gives(h, w);
	}
}

class Milk{}
class Hay{}
class Water{}

