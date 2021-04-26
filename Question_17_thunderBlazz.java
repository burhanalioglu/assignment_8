package assignments.assignment_8;

public class Question_17_thunderBlazz {

	public static void main(String[] args) {

//		There are a few ways to get this galacticly popular drink if it is available at the store you can buy it. or you can get it as a gift.
//		the third option is to mix its ingredients (its a secret formula):
//		1 from ingredient1,2 from ingredient2 and 3 from ingredient3.
//		or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3. this ain't coca-cola...
//		You need to have exact amount of ingredients for making the drink. not less or more		
			
		System.out.println(getThunderBlazz(true,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,5,3));
		System.out.println(getThunderBlazz(false,false,3,1,2));
		System.out.println(getThunderBlazz(false,false,3,1,1));
		System.out.println(getThunderBlazz(false,true,9,7,3));
		
	}

	public static boolean getThunderBlazz(boolean isAvaliable, boolean isGift, int ingredient1, int ingredient2,
			int ingredient3) {
		
		boolean firstOption = isAvaliable || isGift;
		boolean secondOption = ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3;
		boolean thirdOption = ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2;
		
		return firstOption || secondOption || thirdOption;
	}
}
