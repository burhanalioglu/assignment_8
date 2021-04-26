package assignments.assignment_8;

import java.util.Scanner;

public class Question_2_cube {

	public static void main(String[] args) {
//		Question-3
//		Create 2 methods called hello() and world(). Provide an implementation for both of them in order to print an appropriate message. 
//		So hello() method should print "Hello" and world() method should print "World!".
//		output: Hello World!

		cube();

	}

	public static void cube() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write a number to see its cube value: ");
		int numInput = scan.nextInt();
		int cube = numInput * numInput * numInput;
		System.out.println("The number you type: " + numInput);
		System.out.println("The cube of this number: " + cube);
		scan.close();
	}

}
