package Functions;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Random;

public class Student_generation {
	private static void CreateFile() {
		try {
			File list = new File("C:\\Programming projects\\Java\\Students\\Student_List.txt");
			if(list.createNewFile())
				System.out.println("File created successfully.");
			else
				System.out.println("File exists.");
			} catch (IOException e) {
			      System.out.println("An error occurred.");
			    }
	}
	private static int[] GenerateGrades() {
		Random generator = new Random();
		int[] grades = new int[5];
		for(int i = 0; i < 5; i++) {
			int grade = generator.nextInt(1, 11);
			grades[i] = grade;
		}
		return grades;
	}
	private static void CreateStudents(int x) {
		try {
			FileWriter list = new FileWriter("C:\\Programming projects\\Java\\Students\\Student_List.txt");
			for(int counter = 1; counter <= x; counter++) {
				list.write("Student" + counter + "\t");
				int[] grades = Student_generation.GenerateGrades();
				for(int i = 0; i < 5; i++)
					list.write(grades[i] + " ");
				list.write("\n");
			}
			list.close();
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		    }
	}
	public static void Generate() {
		Student_generation.CreateFile();
		System.out.println("Generating 10000 students...");
		Student_generation.GenerateGrades();
		Student_generation.CreateStudents(10000);
		System.out.println("Students generated successfully...");
	}
}
