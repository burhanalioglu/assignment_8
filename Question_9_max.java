package assignments.assignment_8;

public class Question_9_max {

	public static void main(String[] args) {
//		Create a method called max. It gets two ints, x and max.
//		x is the test case, max is what we test against.
//		if x is bigger then max return max
//		in any other case return x.

		System.out.println(max(1,10));
		System.out.println(max(11,5));
	}

	public static int max(int x, int max) {
		if (x > max) {
			return max;
		} else {
			return x;
		}

	}
}
