package example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args)  {
		String fileName;
		String friendName;
		int numFriends;
		PrintWriter outputFile = null;
		FileWriter fw = null;
		
		File inputFile = null;
		Scanner fileScan = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many Friends do you have? ");
		numFriends = input.nextInt();

		input.nextLine();
		
		System.out.println("Enter the output file name: ");
		fileName = input.nextLine();
		
		// open the file to write
		try {
			fw = new FileWriter(fileName, false);
			outputFile = new PrintWriter(fw); // wrapper class
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i <= numFriends; i++) {
			System.out.println("Ener the name of friend number " + i + ": ");
			friendName = input.nextLine();
//			System.out.println(friendName);
			outputFile.println(friendName);
		}
		
		outputFile.close();
		System.out.println("Data written to the file");
		
		// read from a text file
		
		inputFile = new File("Data.txt");
		try {
			fileScan = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (fileScan.hasNext()) {
			System.out.println(fileScan.nextLine());
		}
		
	}

}
