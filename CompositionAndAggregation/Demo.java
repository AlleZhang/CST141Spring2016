import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", "451-4983", "CS", 4.0);
		Student s2 = new Student("Jane", "451-1234", "CS", 3.0);
		Student s3 = new Student("Joey", "451-4321", "CS", 2.0);
		Student[] studentArray = {s1, s2, s3};
		Instructor i = new Instructor("Jane", "451-1234", "Professor", "Monday: 9:30--3:30");
		Textbook tb = new Textbook("Intro to Java", "Daniel Liang", "Pearson", 150.00);
		Classroom c = new Classroom("R233", "Riverhead", 24, "451-1234");
		
		Course c1 = new Course("Intro to Java", "CST141", "12345", 
				i, tb, c, studentArray);
		c1.setClassroom(new Classroom("R212", "Islip", 20, "4519876"));
		System.out.println(c1.getClassroom());
		
	}

}
