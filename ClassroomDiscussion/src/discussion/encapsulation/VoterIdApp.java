package discussion.encapsulation;

public class VoterIdApp {
	private String epicNo;
	private	String name;
	private int age;
	private String gender;

	private String userName;
	private String password;

	public VoterIdApp(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void display() {
		System.out.println("Epic No: " + getEpicNo());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
	}

	public void setVoterDetails(String epicNo, String name, int age, String gender) {
		if(userName.equals("admin") && password.equals("admin") && age > 18 && age < 100) {
			setEpicNo(epicNo);
			setName(name);
			setAge(age);
			setGender(gender);
		} else {
			System.out.println("Invalid data");
		}
	}

	private String getEpicNo() {
		return epicNo;
	}

	private void setEpicNo(String epicNo) {
		this.epicNo = epicNo;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
			this.age = age;
	}

	private String getGender() {
		return gender;
	}

	private void setGender(String gender) {
		this.gender = gender;
	}



}
