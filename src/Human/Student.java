package Human;

public class Student extends Human {
	private int[] grades;
	public int getgrade(int x) {
		return grades[x];
	}
	public Student(String declaredname) {
		nameSetter(declaredname);
	}
}