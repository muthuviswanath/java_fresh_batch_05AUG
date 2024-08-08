/*
 * Rahul buys vegetable from the Local shopkeeper.
 * */
public class Rahul{
	public static void main(String[] args) {
		Shopkeeper s = new Shopkeeper();
		Money m = new Money();
		Vegetables getVegetable = s.sells(m);
		System.out.println(getVegetable);
		
	}
}
class Vegetables{}
class Shopkeeper{

	Vegetables sells(Money m) {
		Vegetables v = new Vegetables();
		System.out.println(v);
		return v;
	}
}
class Money{}

