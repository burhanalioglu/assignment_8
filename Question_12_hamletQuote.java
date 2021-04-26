package assignments.assignment_8;

public class Question_12_hamletQuote {

	public static void main(String[] args) {
		// the hamletQuote method only returns true if one of or both of the boolean
		// parameters is true.
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(false, false));
	}

	public static boolean hamletQuote(boolean bool1, boolean bool2) {
		return (bool1 || bool2);

	}
}
