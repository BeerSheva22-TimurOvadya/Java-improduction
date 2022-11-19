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
		boolean res = true;
		char word[] = str1.toCharArray();
		char anagram[] = str2.toCharArray();

		if (str1.length() == str2.length()) {

			for (int i : word) {
				if (count(word, i) != count(anagram, i)) {
					res = false;
				}
			}
		} else {
			res = false;
		}
		return res;
	}

	private static int count(char[] str, int i) {
		int count = 0;
		for (int num : str) {
			if (num == i) {
				count++;
			}
		}
		return count;
	}

//	second method 
	public static boolean isAnagram_2(String str1, String str2) {

		int r = 0;
		for (int i = 0; i < str1.length(); i++) {
			r = r ^ str1.charAt(i);
		}
		for (int i = 0; i < str2.length(); i++) {
			r = r ^ str2.charAt(i);
		}
		return r == 0 ? true : false;
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
