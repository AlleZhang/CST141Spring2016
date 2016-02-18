
public class Course {
	
	private String title;
	private String courseNumber;
	private String crn;
	private Instructor instructor;
	private Textbook textbook;
	private Classroom classroom;
	private Student[] students;
	
	public Course() {}

	public Course(String title, String courseNumber, String crn,
			Instructor instructor, Textbook textbook, Classroom classroom,
			Student[] students) {
		super();
		this.title = title;
		this.courseNumber = courseNumber;
		this.crn = crn;
		this.instructor = new Instructor(instructor);
		this.textbook = new Textbook(textbook);
		this.classroom = new Classroom(classroom);
		this.students = new Student[students.length];
		for(int i = 0; i < students.length; i++) {
			this.students[i] = new Student(students[i]);
		}
	};
	
	public Course(String title, String courseNumber, String crn) {
		this.title = title;
		this.courseNumber = courseNumber;
		this.crn = crn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public Instructor getInstructor() {
		return new Instructor(instructor);
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Textbook getTextbook() {
		return new Textbook(textbook);
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Classroom getClassroom() {
		return new Classroom(classroom);
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Student[] getStudents() {
		Student[] studentArrayCopy = new Student[students.length];
		for(int i = 0; i < students.length; i++) {
			studentArrayCopy[i] = new Student(students[i]);
		}
		return studentArrayCopy;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	
	public String toString() {
		String str = "Course: \n\tCourse Title: " + title +", \n\tCourse Number: "
				+ courseNumber + ", \n\tCRN: " + crn + ", \n\tInstructor: " + instructor +
				",\n\tTextbook: " + textbook + ",\n\tClassroom: " + classroom;
		String tempStr = "";
		for(int i = 0; i < students.length; i++) {
			tempStr += students[i] + "\n";
		}
		
		return str + "\n" + tempStr;
	}
	
	

}
