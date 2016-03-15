import java.util.Arrays;

public class BodyBag {
	
	private Student[] bag;
	private int nElems;
	
	public BodyBag(int maxSize) {
		bag = new Student[maxSize];
		nElems = 0;
	}
	
	public void add(Student s) {
		bag[nElems++] = s;
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(bag[i]);
		}
		System.out.println();
	}
	
	public Student[] findHighestLetterGrades() {
		Student[] allHighestGrades = new Student[nElems];
		char highestLetterGrade = findHighestLetterGrade().getLetterGrade();
		int count = 0;
		for(int i = 0;  i < nElems; i++) {
			if(highestLetterGrade == bag[i].getLetterGrade()) {
				allHighestGrades[count++] = bag[i];
			}
		}
		return Arrays.copyOf(allHighestGrades, count);
	}
	
	public Student findHighestLetterGrade() {
		char highestLetterGrade = bag[0].getLetterGrade();
		int index = 0;
		for (int i = 1; i < nElems; i++) {
			if(highestLetterGrade > bag[i].getLetterGrade()) {
				highestLetterGrade = bag[i].getLetterGrade();
				index = i;
			}
		}
		return bag[index];
	}
}
