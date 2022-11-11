import java.util.Arrays;

public class MyArrays {
	/**
	 * 
	 * @param array
	 * @param number
	 * @return new array with added at end a given number
	 */
	public static int[] addsNumber(int[] array, int number) {
		// use standard class Arrays, method copyOf
		int res[] = Arrays.copyOf(array, array.length + 1);
		res[array.length] = number;
		return res;
	}

	/**
	 * 
	 * @param array
	 * @param index
	 * @return new array with no number at a given index in a given array if index
	 *         doesn't exist in a given array it returns the same array
	 */
	public static int[] removeNumber(int array[], int index) {
		// use standard class System, method arraycopy

		int res[] = array;
		if (index > -1 && index < array.length) {
			res = new int[array.length - 1];
			System.arraycopy(array, 0, res, 0, index);
			System.arraycopy(array, index + 1, res, index, res.length - index);
		}

		return res;
	}

	/**
	 * 
	 * @param arraySorted - sorted array
	 * @param number
	 * @return new array with inserted number at an index for keeping array sorted
	 */
	public static int[] insertSorted(int arraySorted[], int number) {
		// use the method binarySearch of the standard class Arrays
		// use the method arraycopy of the standard class System
		int index = Arrays.binarySearch(arraySorted, number);
		if (index < 0) {
			index = -(index + 1);
		}
		return insertAtIndex(arraySorted, number, index);

	}

	private static int[] insertAtIndex(int[] array, int number, int index) {
		int res[] = new int[array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		return res;
	}

	/**
	 * 
	 * @param arraySorted
	 * @param number
	 * @return index value if number exist otherwise -1 O[N] - search number in
	 *         unsorted array O[LogN] - search number in sorted (binary search)
	 */
	public static int binarySearch(int arraySorted[], int number) {
		int left = 0;
		int right = arraySorted.length - 1;
		int middle = right / 2;
		while (left <= right && arraySorted[middle] != number) {
			if (number < arraySorted[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
			middle = (left + right) / 2;
		}
		int res = left;
		if (arraySorted[left] != number) {
			res = -(left + 1);
		}
		return res;
	}

	
	
	
	public static boolean isOneSwapForSorted(int[] array) {
		boolean res = false;
		int pos = array.length;
		if (checkSort(pos, array))
			res = true;
		else
			res = false;
		return res;
	}

	static boolean checkSort(int pos, int arr[]) {
		int first = 0;
		int second = 0;
		int count = 0;
		for (int i = 1; i < pos; i++) {
			if (arr[i] < arr[i - 1]) {
				count++;
				if (first == 0)
					first = i;
				else
					second = i;
			}
		}
		if (count > 2) {
			return false;
		}
		if (count == 0) {
			return true;
		}
		if (count == 2) {
			swap(arr, first - 1, second);
		} else if (count == 1) {
			swap(arr, first - 1, first);
		}
		for (int i = 1; i < pos; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	

	// bubbleSort
	public static void main(String[] args) {
//		int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 99);
		}
		System.out.println("Unsorted array" + Arrays.toString(array) + "!");
		int Chek = 0;
		boolean isSorted = false;
		while (!isSorted) {
			Chek++;
			isSorted = true;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					swap(array, i - 1, i);
					isSorted = false;
				}
			}
			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] < array[i - 1]) {
					swap(array, i - 1, i);
					isSorted = false;
				}
			}
			System.out.println("Chek # " + Chek + " - " + Arrays.toString(array) + ";");
		}
		System.out.println("Sorted array" + Arrays.toString(array) + "!");
	}

	public static void swap(int array[], int index1, int index2) {
		int buffer = array[index1];
		array[index1] = array[index2];
		array[index2] = buffer;
	}

}