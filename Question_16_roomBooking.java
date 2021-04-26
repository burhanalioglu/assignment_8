package assignments.assignment_8;

public class Question_16_roomBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simpleRoomBook(false, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 7, 2, 2018));
	}

	public static boolean simpleRoomBook(boolean isAvaliable, int month, int date, int year) {
		boolean flag = true;
		if (year == 2018 && month == 7 && (date <= 8 && date >= 1) || isAvaliable == false) {
			flag = false;
		}
		return flag;
	}
}
