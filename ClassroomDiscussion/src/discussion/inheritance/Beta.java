package discussion.inheritance;

public class Beta extends Alpha{
	@Override
	void check() {
		System.out.println("Checked");
	}
	void dontshow() {
		System.out.println("Don't show");
	}
	public static void main(String[] args) {
		Beta beta = new Beta();
		beta.check();
		beta.show();
		beta.dontshow();
	}

	//For the overridden method, the implementation always happens from
	// the sub class.

	//Only the sub class can inherit from the super class and not vice-versa
}
