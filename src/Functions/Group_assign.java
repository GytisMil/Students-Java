package Functions;
import Human.Student;
import java.util.ArrayList;

public class Group_assign {
	private static boolean Check_education(Student x) {
		if(x.getaverage() >= 5)
			return true;
		else
			return false;
	}
	public static ArrayList<Student> uneducated_group(ArrayList<Student> list) {
		ArrayList<Student> uneducated = new ArrayList<Student>();
		for(int i = 0; i < list.size(); i++) {
			Student temp = list.get(i);
			if(!Check_education(temp))
				uneducated.add(temp);
		}
		return uneducated;
	}
	public static ArrayList<Student> educated_group(ArrayList<Student> list) {
		ArrayList<Student> educated = new ArrayList<Student>();
		for(int i = 0; i < list.size(); i++) {
			Student temp = list.get(i);
			if(Check_education(temp))
				educated.add(temp);
		}
		return educated;
	}
}