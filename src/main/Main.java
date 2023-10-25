package main;
import Human.Student;
import java.util.Scanner;
import Input_Checks.*;
import Functions.*;

public class Main {
	public static void main(String[] args) {
		Scanner User_input = new Scanner(System.in); //Use for User input
		System.out.println("Generate list of Students? (0 - No | 1 - Yes)");
		int generation_choice = 0;
		boolean input_format_check = false;
		while(!input_format_check) {
			try {
				
				int input = User_input.nextInt();
				input_format_check = One_Zero.Check(input);
				generation_choice = input;
			
			} catch (Exception e) {
				System.out.println("Invalid input. Try again");
				User_input.next();
			}
		}
		if(generation_choice == 1)
			Student_generation.Generate();
	}
}