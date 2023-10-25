package Input_Checks;

public class One_Zero {
	private boolean output;
	public static boolean Check(int x) {
		if(x == 0 || x == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}