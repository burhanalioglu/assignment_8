package assignments.assignment_8;

public class Question_11_profit {

	public static void main(String[] args) {
//		c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//		it returns a string value that can be "profit","loss","no loss"
		System.out.println(c_profits(100, 1500));
		System.out.println(c_profits(20, 5));
		System.out.println(c_profits(100, 100));
	}

	public static String c_profits(int buyPrice, int sellPrice) {
		if (buyPrice < sellPrice) {
			return "profit";
		} else if (buyPrice > sellPrice) {
			return "loss";
		} else {
			return "no loss";
		}
	}

}
