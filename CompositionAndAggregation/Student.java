
public class Student {
	
	private String name;
	private String phone;
	private String major;
	private double gpa;
	
	public Student(String name, String phone, String major, double gpa) {
		super();
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.gpa = gpa;
	}
	
	public Student(Student s) {
		this.name = s.getName();
		this.phone = s.getPhone();
		this.major = s.getMajor();
		this.gpa = s.getGpa();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student:\n\tname=" + name + ", \n\tphone=" + phone + ", \n\tmajor="
				+ major + ", \n\tgpa=" + gpa;
	}
}
