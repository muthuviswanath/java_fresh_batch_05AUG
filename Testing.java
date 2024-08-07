
public class Testing {
	void check() {
		GlobalVariables gv = new GlobalVariables();
		System.out.println(gv.f);
		System.out.println(GlobalVariables.bool);
	}
	
	Testing(){
		GlobalVariables gv = new GlobalVariables();
		System.out.println(gv.f);
		System.out.println(GlobalVariables.bool);
	}
	public static void main(String[] args) {
		GlobalVariables gv = new GlobalVariables();
		System.out.println(gv.f);
		System.out.println(GlobalVariables.bool);
	}
}
