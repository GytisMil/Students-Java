package Functions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import Human.Student;

public class Student_list_read {
	private static void openFile(ArrayList<Student> student_arraylist) {
		try {
		      File student_list = new File("C:\\Programming projects\\Java\\Students\\Student_List.txt");
		      Scanner File_Reader = new Scanner(student_list);
		      while (File_Reader.hasNextLine()) {
		        String data = File_Reader.nextLine();
		        Student student_from_file = Read_Student(data);
		        student_arraylist.add(student_from_file);
		      }
		      File_Reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	private static Student Read_Student(String data) {
		String[] spliced_data = data.split(" ", 0);
		String[] name_grade = spliced_data[0].split("\t", 0);
		spliced_data[0] = name_grade[1];
		Student New_Student = new Student(name_grade[0]);
		New_Student.assigngradelength(5);
		int grade = 0;
		for(int i = 0; i < 5; i++) {
			grade = Integer.parseInt(spliced_data[i]);
			New_Student.assigngrade(i, grade);
		}
		return New_Student;
	}
	public static ArrayList<Student> Get_Student_list() {
		ArrayList<Student> list = new ArrayList<Student>();
		openFile(list);
		return list;
	}
}