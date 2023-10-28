package Human;

public class Student extends Human {
	private int[] grades;
	private float grade_average;
	
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
	public void setaverage(float x) {
		grade_average = x;
	}
	public float getaverage() {
		return grade_average;
	}
	public Student(String declaredname) {
		nameSetter(declaredname);
	}
	public Student() {}
}