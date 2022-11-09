
public class IsraelIdentity {
	public static final int ID_LENGTH = 9;

	/**
	 * 
	 * @param id
	 * @return true for right id otherwise false control sum should be multiple of
	 *         10 (sum % 10 == 0) for even indexes (0, 2, 4, 6, 8) digits as is for
	 *         odd indexes (1, 3, 5, 7, 9) digit = digit *2, if > 9 the sum of
	 *         digits is taken example, 123456782 => 1 + 4(2*2) + 3 + 8(4*2) + 5
	 *         +3(6*2 = 12 => 1+2) + 7 + 7 (8*2=16 => 1+6) + 2 = 40. 40 /10 T.Z.
	 *         good
	 */
	public static boolean verify(int id) {
		int sum = -1;
		if (Numbers.getNdigits(id) == ID_LENGTH & id > 0) {
			sum = getControlSum(Numbers.getDigits(id));
		}
		return sum % 10 == 0;

	}

	private static int getControlSum(int[] digitArray) {
		int sum = 0;
		for (int i = 0; i < ID_LENGTH; i++) {
			sum = sum + digitArray[i];
		}

		for (int i = 1; i < ID_LENGTH; i = i + 2) {
			int newsum = 2 * digitArray[i];
			if (Numbers.getNdigits(newsum) > 1) {
				sum = sum + Numbers.getSumDigits(newsum);
			} else
				sum = sum + newsum;
		}
		return sum;
	}

	/**
	 * 
	 * @return random number of 9 digits matching right Israel id cycle not more
	 *         than 9 iterations
	 */

	public static int generateRandomId() {
		int Array[] = new int[ID_LENGTH];

		Array[0] = getRandomInt(1, ID_LENGTH);
		for (int i = 0; i < ID_LENGTH - 1; i++) {
			Array[i] = getRandomInt(1, ID_LENGTH);
		}
		int Sum = getControlSum(Array) % 10;
		Array[ID_LENGTH - 1] = Sum == 0 ? 0 : (10 - Sum);
		
		return Numbers.getNumberFromDigits(Array);
	}

	public static int getRandomInt(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}
}
