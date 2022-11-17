import java.util.Arrays;

public class Strings {
	/**
	 * 
	 * @param str
	 * @param anagram
	 * @return true if str2 is an anagram of str1 complexity 0[N] two passes 1. the
	 *         same length 2. the same symbols just in different order
	 */
	
	//First Method - O(N^2) ?
	public static boolean isAnagram(String str1, String str2) {
		boolean res = true;
		char symbols[] = str1.toCharArray();
		char anagram[] = str2.toCharArray();

		if (str1.length() != str2.length()) {
			res = false;
		}
		Arrays.sort(anagram);
		Arrays.sort(symbols);

		for (int i = 0; i < str1.length() && res; i++) {
			if (symbols[i] != anagram[i]) {
				res = false;
			}
		}
		return res;
	}
}
