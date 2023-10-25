package Human;

public class Student extends Human {
	private int[] grades;
	
	public int getgrade(int x) {
		return grades[x];
	}
	public void gradelength(int x) {
		grades = new int[x];
	}
	public int getlength() {
		return grades.length;
	}
	public Student(String declaredname) {
		nameSetter(declaredname);
	}
}