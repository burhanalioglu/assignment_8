package assignments.assignment_8;

public class Question_15_taskValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateTask(true,2,1));
		System.out.println(validateTask(true,3,1));
		System.out.println(validateTask(true,3,1));
	}

	public static boolean validateTask(boolean bool, int nextTask, int currentId) {
		return (bool && nextTask - 1 == currentId);
	}

}
