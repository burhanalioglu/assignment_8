package assignments.assignment_8;

public class Question_8_fibonacci {

	public static void main(String[] args) {
//		Complete a method fib() that will compute Fibonacci numbers. In fibonacci series, next number is the sum of previous two numbers 
//		for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0 and 1.
//		Given a number num, print n-th Fibonacci Number.

		fib(9);

	}

	public static void fib(int counter) {

		int num1 = 0;
		int num2 = 1;
		int res = 0;

		for (int i = 1; i < counter; i++) {
			res = num1 + num2;
			num2 = num1;
			num1 = res;
		}


		System.out.println(res);

	}

}
