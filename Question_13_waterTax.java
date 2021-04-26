package assignments.assignment_8;

public class Question_13_waterTax {

	public static void main(String[] args) {
//		This method calculates a water bill, the method gets a double and returns a double.
//		The more water you use the more it will cost you (as a fine for wasting water).
//		the regular calculation under 50 is		bill = units * 0.60;		above 50 is:		bill = units * 0.90;
//		above 100 the calculation is like above 50 but with a 50 as fine
//		and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price.
		System.out.println(waterTax(50));
		System.out.println(waterTax(55));
		System.out.println(waterTax(101));
		System.out.println(waterTax(151));
	}

	public static double waterTax(double waterConsume) {
		double waterTax = 0;

		if (waterConsume <= 50) {
			waterTax = waterConsume * 0.6;
		} else if (waterConsume <= 100) {
			waterTax = waterConsume * 0.9;
		} else if (waterConsume <= 150) {
			waterTax = waterConsume * 0.9 + 50;
		} else {
			waterTax = waterConsume * 0.9 + 100;
		}

		return waterTax;

	}

}
