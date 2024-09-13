package discussion.collectionframework;

public class ArrayUtility {

	static <E>  void printArray(E[] arr){
		for (E e : arr) {
			if (arr instanceof Employee[]) {
				Employee emp = (Employee) e;
				System.out.println(emp.empno + " | " + emp.ename + " | " + emp.salary);
			}
			else if(arr instanceof Product[]) {
				Product p = (Product) e;
				System.out.println(p.pid + " + " + p.pname + " + " + p.price);
			}
			else if(arr instanceof Student[]) {
				Student s = (Student) e;
				System.out.println(s.sid + " - " + s.sname + " - " + s.marks);
			}
			else
				System.out.println("Invalid Array");
		}
	}
}
