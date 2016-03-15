
public class Student {
	
	private String name;
	private double midterm;
	private double finalExam;
	private char letterGrade;
	
	public Student(String name, double midterm, double finalExam, char letterGrade) {
		this.name = name;
		this.midterm = midterm;
		this. finalExam = finalExam;
		this.letterGrade = letterGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", midterm=" + midterm + ", finalExam="
				+ finalExam + ", letterGrade=" + letterGrade + "]";
	}
}
