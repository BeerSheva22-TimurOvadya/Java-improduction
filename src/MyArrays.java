import java.util.Arrays;


public class MyArrays {
	/**
	 * 
	 * @param array
	 * @param number
	 * @return new array with added at end a given number
	 */
	public static int[] addsNumber(int[] array, int number) {
		int [] res = Arrays.copyOf(array, array.length+1);
		res [res.length-1] = number;
		// use standard class Arrays, method copyOf
		return res;
	}
	
	/**
	 * 
	 * @param array
	 * @param index
	 * @return new array with no number at a given index in a given array
	 * if index doesn't exist in a given array it returns the same array
	 */
	public static int [] removeNumber(int array[], int index) {
		int[] res = array;
		if (index > 0 & index < array.length) {
			res = new int[array.length - 1];
			System.arraycopy(array, index + 1, res, index, (array.length - index) - 1);
			System.arraycopy(array, 0, res, 0, index);
			
		}
		return res;
	}
		// use standard class System, method arraycopy
		
	/**
	 * 
	 * @param arraySorted - sorted array
	 * @param number
	 * @return new array with inserted number at an index for keeping array sorted 
	 */
	
		public static int[] insertSorted(int[] arraySorted, int number) {
			Arrays.sort(arraySorted);
			int []res = new int[arraySorted.length + 1];			
			int numPos = Arrays.binarySearch(arraySorted , number);			
			if (numPos < 0)	numPos = -(1 + numPos);						
			res[numPos] = number;
			System.arraycopy(arraySorted, numPos, res, numPos + 1, arraySorted.length - numPos);
			System.arraycopy(arraySorted, 0, res, 0, numPos);			
			return res;
		
		// use the method binarySearch of standard class Arrays
		// use the method arraycopy of the standard class System
		
		
	}
}

