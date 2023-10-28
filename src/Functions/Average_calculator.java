package Functions;
import Human.Student;
import java.util.ArrayList;

public class Average_calculator {
	private static float calculate_average(Student x) {
		float average = 0;
		for(int i = 0; i < 5; i++)
			average += x.getgrade(i);
		average /= 5;
		return average;
	}
	public static void calculate_list_average(ArrayList <Student> list) {
		for (int i = 0; i < list.size(); i++) {
			Student temp = list.get(i);
			float temp_average = calculate_average(temp);
			list.get(i).setaverage(temp_average);
		}
	}
}