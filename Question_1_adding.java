package assignments.assignment_8;

import java.util.Scanner;

public class Question_1_adding {

	public static void main(String[] args) {
//		Question-1
//		Create a method called "plus", its return is void and it gets no arguments.
//		It asks the user to input two numbers, then it will add them and print the result.
//		Create a scanner within the plus method.
//		Example:
//		enter first number:
//		1
//		enter second number:
//		2
//		result: 3
		plus();

	}

	public static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNum = scan.nextInt();
		System.out.print("Enter second number: ");
		int secondNum = scan.nextInt();
		int res = firstNum + secondNum;
		System.out.println("result: " + res);
		scan.close();
	}

}
