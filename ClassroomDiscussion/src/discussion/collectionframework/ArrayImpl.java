package discussion.collectionframework;

public class ArrayImpl {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "John", 10000);
		Product p1 = new Product(101, "Mobile", 10000);
		Student s1 = new Student(101, "John", 100);

		Employee[] empArr = {e1};
		Product[] prodArr = {p1};
		Student[] studArr = {s1};

		ArrayUtility.printArray(empArr);
		ArrayUtility.printArray(prodArr);
		ArrayUtility.printArray(studArr);
	}

}

class Employee{
	int empno;
	String ename;
	double salary;

	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
}
class Product{
	int pid;
	String pname;
	double price;

	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
}
class Student{
	int sid;
	String sname;
	double marks;

	public Student(int sid, String sname, double marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
}
//Employee
// EmpNo | Ename | Salary
// 101   | John  |  10000

//Product
// Pid + Pname + Price
// 101 + Mobile + 10000

//Student
// Sid - Sname - Marks
// 101 - John - 100