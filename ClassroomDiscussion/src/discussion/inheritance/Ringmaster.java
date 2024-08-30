package discussion.inheritance;

public class Ringmaster {

	static void invokeAnimals(Animals a) {
		if (a instanceof Lion){
			a.eat();
			a.makeNoise();
			Lion l = (Lion) a;
			l.smile();
		}
		else if (a instanceof Tiger){
			a.eat();
			a.makeNoise();
			Tiger t = (Tiger) a;
			t.smile();
		}
	}
	public static void main(String[] args) {
		Lion l = new Lion();
		Tiger t = new Tiger();
		invokeAnimals(l);
		invokeAnimals(t);
	}
}
