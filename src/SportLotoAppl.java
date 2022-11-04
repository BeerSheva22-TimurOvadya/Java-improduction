
//public class SportLotoAppl {
//
//	/**
//	 * Application displays out 6 random numbers from 1 to 49 inclusive
//	 * numbers  can not be repeated in a sequence of 6 random numbers
//	 * no additional collections arrays
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//System.out.print("" + 100 + " " + 200);
//		for (int i =0; i < 6; i++) {
//			System.out.print(getRandomInt(1, 49) + " ");
//		}
//		
//	}
//	public static int getRandomInt(int min, int max) {
//		return (int) (min + Math.random() * (max - min +1 ));
//	}
//}

public class SportLotoAppl {
	public static void main(String[] args) {

		int num1, num2, num3, num4, num5, num6;
		
		num1 = (int) (Math.random()*50);
		
		do {
			num2 = (int) (Math.random()*50);
		} while (num2 == num1);
		
		do {
			num3 = (int) (Math.random()*50);
		} while (num3 == num2 || num3 == num1);
		
		do {
			num4 = (int) (Math.random()*50);
		} while (num4 == num3 || num4 == num2 || num4 == num1);
		
		do {
			num5 = (int) (Math.random()*50);
		} while (num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1);
		
		do {
			num6 = (int) (Math.random()*50);
		} while (num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1);
		
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
	}
}
