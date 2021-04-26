package assignments.assignment_8;

public class Question_6_nextNums {

	public static void main(String[] args) {
		// Create a method called next3 . This method gets an int argument and prints
		// the next 3 numbers after that number. Call the method from main method and
		// pass num to it.
		next3(5);
	}

	public static void next3(int num) {
		for (int i = 1; i <= 3; i++) {
			System.out.print(num + i + " ");
		}

	}

}
