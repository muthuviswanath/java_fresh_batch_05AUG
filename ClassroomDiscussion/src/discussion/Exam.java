package discussion;

public class Exam {
	int maths;
	int physics;
	int compsci;
	int chemistry;
	int biology;
	int statistics;
	int accounts;
	int commerce;
	int lab;
	int programminglab;
	public Exam(int maths, int physics, int compsci, int chemistry, int lab, int programminglab) {
		this.maths = maths;
		this.physics = physics;
		this.compsci = compsci;
		this.chemistry = chemistry;
		this.lab = lab;
		this.programminglab = programminglab;
	}
	public Exam(int maths, int physics, int chemistry, int biology, int lab) {
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.lab = lab;
	}
	public Exam(int maths, int statistics, int accounts, int commerce) {
		this.maths = maths;
		this.statistics = statistics;
		this.accounts = accounts;
		this.commerce = commerce;
	}

	public static void main(String[] args) {
		Exam commerce_exam = new Exam(100, 80, 98, 100);
		Exam science_exam = new Exam(100, 100, 100, 100, 100);
		Exam compsci_exam = new Exam(40,45,40,39,60,45);
		
	}
}
