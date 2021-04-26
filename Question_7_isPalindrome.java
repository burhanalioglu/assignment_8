package assignments.assignment_8;

public class Question_7_isPalindrome {

	public static void main(String[] args) {
//		Complete a method isPalindrome() that will check if the number is a palindrome. Print your result as a boolean (true or false).
//		Do not convert int into a string!
		System.out.println(isPalindrome(1234));
		System.out.println(isPalindrome(1001));
		
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int reverse = 0;

		while (temp != 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println(num + " " +reverse);
		return num == reverse;
	}

}
