package discussion.collectionframework;

public class Generics <T>{
	T empno;
	/*
	 * K Key
	 * V Value
	 * T Type
	 * E Element
	 * N Number
     * Nonsense
	 * */

	void setEmpno(T empno) {
		this.empno = empno;
	}
	void display() {
		System.out.println("Employee Number: " + empno);
	}

}
