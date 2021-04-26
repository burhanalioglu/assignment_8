package assignments.assignment_8;

import java.util.Scanner;

public class Question_5_sign {

	public static void main(String[] args) {
//		Create a method called sign.  It gets a number and tells you if its positive, negative or zero.
//		for example : 		sign(5) => 1  	sign(-30)=> -1	sign(0) => 0
//		sign gets an int parameter.
//		print out 1,-1 or 0 depending on the input
//		the parameter should be entered by user (create a scanner object)

		Scanner scan = new Scanner(System.in);
		System.out.println("Please write your number to see whether it is neg or pos: ");
		int numInput = scan.nextInt();

		System.out.println(sign(numInput));

		scan.close();
	}

	public static int sign(int num) {
		int res = 0;

		if (num < 0) {
			res = -1;
		} else if (num > 0) {
			res = 1;
		} else {
			res = 0;
		}

		return res;
	}

}
