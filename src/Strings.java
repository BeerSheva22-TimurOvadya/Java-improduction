public class Strings {

	private static final int MIN_VALUE = Byte.MIN_VALUE;

	private static final int MAX_VALUE = Byte.MAX_VALUE + 1;

	/**
	 * 
	 * @param str
	 * @param anagram
	 * @return true if str2 is an anagram of str1 complexity 0[N] two passes 1. the
	 *         same length 2. the same symbols just in different order
	 */
	public static boolean isAnagram(String str1, String str2) {
		int count = 0;
		boolean res = false;
		if (str2.length() == str1.length()) {
			int[] helper = new int[Character.MAX_VALUE];
			for (int i = 0; i < str2.length(); i++) {
				helper[(int) str1.charAt(i)]--;
				helper[(int) str2.charAt(i)]++;
			}
			
			do {
				count++;
			} while (count < helper.length && helper[count] == 0);

			if (count == Character.MAX_VALUE) {
				res = true;
			} else {
				res = false;
			}
		}
		return res;
	}

	
	
	public static void sortStringNumbers(String[] array) {
		byte[] helper = new byte[MAX_VALUE - MIN_VALUE];
		for (int i = 0; i < array.length; i++) {
			helper[Byte.parseByte(array[i]) - MIN_VALUE]++;
		}
		int count = 0;
		Integer i = (int) MIN_VALUE;
		while (i < MAX_VALUE && array.length > count) {
			while (helper[i - MIN_VALUE] > 0) {
				array[count] = i.toString();
				helper[i - MIN_VALUE]--;
				count++;
			}
			i++;
		}
	}

}
