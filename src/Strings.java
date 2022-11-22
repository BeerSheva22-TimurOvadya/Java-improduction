import static org.junit.jupiter.api.Assertions.assertTrue;

public class Strings {

	/**
	 * 
	 * @param str
	 * @param anagram
	 * @return true if str2 is an anagram of str1 complexity 0[N] two passes 1. the
	 *         same length 2. the same symbols just in different order
	 */
	public static boolean isAnagram(String str1, String str2) {
		boolean res = false;
		if (str1.length() == str2.length()) {
			int helper[] = new int[Byte.MAX_VALUE];
			res = true;
			fillHelper(helper, str1);
			int index = 0;
			int length = str2.length();
			while (index < length && res) {
				int indSymb = str2.charAt(index);
				if (helper[indSymb] == 0) {
					res = false;
				} else {
					helper[indSymb]--;
					index++;
				}
			}
		}
		return res;
	}

	private static void fillHelper(int[] helper, String str1) {
		int length = str1.length();
		for (int i = 0; i < length; i++) {
			int ind = str1.charAt(i);
			helper[ind]++;
		}

	}

	public static void sortStringNumbers(String[] array) {
		int offset = Byte.MAX_VALUE + 1;
		int helper[] = new int[offset * 2];
		fillHelper(helper, array, offset);
		sortFromHelper(array, helper, offset);
	}

	private static void sortFromHelper(String[] array, int[] helper, int offset) {
		int arrayInd = 0;
		for (int i = 0; i < helper.length; i++) {
			for (int j = 0; j < helper[i]; j++) {
				array[arrayInd++] = getStringNumberFromIndex(i, offset);
			}
		}

	}

	private static String getStringNumberFromIndex(int index, int offset) {
		int number = index - offset;

		return Integer.toString(number);
	}

	private static void fillHelper(int[] helper, String[] array, int offset) {
		for (int i = 0; i < array.length; i++) {
			int index = getIndexFromStringNumber(array[i], offset);
			helper[index]++;
		}

	}

	private static int getIndexFromStringNumber(String string, int offset) {
		int number = Integer.parseInt(string);
		return number + offset;
	}

	public static String javaNameExp() {
		
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}

	public static String ipV4Octet() {	

		return "([\\d]|[\\d][\\d]|[01][\\d][\\d]|2[0-4][\\d]|25[0-5])";
	}
	

	public static String ipV4() { 
		
		return "(" + ipV4Octet() + "\\.){3}" + ipV4Octet();
	}
	
	
}
