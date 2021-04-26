package assignments.assignment_8;

public class Question_14_threeBoolean {

	public static void main(String[] args) {
//		 	This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
//			It returns true only if both a and b are true or c is true.

	}

	public static boolean threeLocks(boolean bool1, boolean bool2, boolean bool3) {
		return ((bool1 == true && bool2 == true) || bool3 == true);
	}

}
