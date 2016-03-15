import java.util.Arrays;

public class Demo {
	public static void main(String [] args) {
		BodyBag bag = new BodyBag(10);
		bag.add(new Student("Adam", 50, 50, 'C'));
		bag.add(new Student("Bill", 30, 70, 'D'));
		bag.add(new Student("Cathy", 60, 40, 'A'));
		System.out.println(Arrays.toString(bag.findHighestLetterGrades()));
	}
}
