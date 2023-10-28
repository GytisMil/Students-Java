package Human;

public class Student extends Human {
	private int[] grades;
	
	public int getgrade(int x) {
		return grades[x];
	}
	public void assigngradelength(int x) {
		grades = new int[x];
	}
	public int getlength() {
		return grades.length;
	}
	public void assigngrade(int x, int y) {
		grades[x] = y;
	}
	public Student(String declaredname) {
		nameSetter(declaredname);
	}
	public Student() {}
}