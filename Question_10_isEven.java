package assignments.assignment_8;

public class Question_10_isEven {

	public static void main(String[] args) {
//		isEven method gets a number(int) if its even (2,4,8...) returns true.		if its odd return false.
		System.out.println(isEven(1));
		System.out.println(isEven(8));
	}

	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}

}
