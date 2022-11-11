import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrimitivesTest {

	@Test
	@Disabled
	void dataTypeTest() {
		int b = 10;
		short a = 20000;
		char c = 'd';
		long l = (long) 10.1;
		byte b1 = (byte) 1000;
		a = (short) l;
		float f = 10.2f; // ставим f что бы принялось как флоат
		int b2 = 0xfffffff1; 
				
		assertEquals (-15, b2); //сравнение, что одно равно другому
	}
	@Test
	@Disabled
	void operatorsTest() {
		int a = 10;
		assertEquals (13, a + 3);
		assertEquals (1, a % 3);
		int number = 123;
		assertEquals(3, getThirdDigit(number));
		assertEquals(2, getSecondDigit(number));
		assertEquals(1, getFirstDigit(number));
		
	}
	private int getFirstDigit(int number) {return number / 100; }
	private int getSecondDigit(int number) {return (number / 10) % 10; }
	private int getThirdDigit(int number) {return number %10; }

	@Test
	@Disabled
	void getBitValueTest() {
		long num = 0x3ab7f5; //001110101011011111_1_10101
		assertEquals(1, BitOperations.getBitValue(num, 5));
		assertEquals(0, BitOperations.getBitValue(num, 11));
		assertEquals(0, BitOperations.getBitValue(num, 1));
		assertEquals(1, BitOperations.getBitValue(num, 2));
		assertEquals(-1, BitOperations.getBitValue(num, 100));
		assertEquals(-1, BitOperations.getBitValue(num, -2));
		
	}
	@Test
	@Disabled
	void setBitValueTest() {
		long num = 0x3ab7f5; //001110101011011111_1_10101
		assertEquals(0x3ab7d5, BitOperations.setBitValue(num, 5, false));
		assertEquals(0x3ab7f5, BitOperations.setBitValue(num, 5, true));
	}
	@Test
	@Disabled
	void invertBitValueTest() {
		long number = 0x3ab7f5; //001110101011011111_1_10101
		assertEquals(0x3ab7d5, BitOperations.invertBitValue(number, 5));
		assertEquals(0x3ab7f4, BitOperations.invertBitValue(number, 0));
		number = -1;
		assertEquals(1, BitOperations.getBitValue(number, 63));
		number = BitOperations.invertBitValue(number, 63);
		assertEquals(0, BitOperations.getBitValue(number, 63));
		
	}
	
	@Test
	@Disabled
	void digitsNumberTest() {
		assertEquals(1, Numbers.getNdigits(9));
		assertEquals(2, Numbers.getNdigits(99));
		assertEquals(4, Numbers.getNdigits(02305));
		assertEquals(5, Numbers.getNdigits(12345));
		assertEquals(9, Numbers.getNdigits(987654321));
	}
	
	@Test
	@Disabled
	void leadingZerosTest() {
		assertEquals(0, BitOperations.leadingZeros(-9));
		assertEquals(64, BitOperations.leadingZeros(0));
		assertEquals(43, BitOperations.leadingZeros(1234567)); 
		assertEquals(54, BitOperations.leadingZeros(1000)); 
		
	}
	
	@Test 
	@Disabled
	void isHappyNumberTest() {
		int expectedTrue = 123321;
		int expectedFalse = 123467;
		assertTrue( Numbers.isHappyNumber(expectedTrue));
		assertFalse( Numbers.isHappyNumber(expectedFalse));
	}
	@Test
	@Disabled
	void onesInNumberTest() {
		assertEquals(1, BitOperations.onesInNumber(1));
		assertEquals(0, BitOperations.onesInNumber(0));
		assertEquals(1, BitOperations.onesInNumber(64)); 
		assertEquals(64, BitOperations.onesInNumber(-1));
		assertEquals(10, BitOperations.onesInNumber(10236046)); 
	}
	@Test
	@Disabled
	void getDigitsTest() {
		int expected[] = {1, 2, 3, 4};
		assertArrayEquals(expected, Numbers.getDigits(1234));
	}
	@Test
	@Disabled
	void getNumberFromDigitsTest() {
		int expectedNumber = 1234;		
		assertEquals(expectedNumber, Numbers.getNumberFromDigits(new int[]{1, 2, 3, 4}));
	}
	
	@Test
	@Disabled
	void addNumberTest () {
		int[] expected = {4, 67, -88, 3333, 0, 77 };
		assertArrayEquals(expected, MyArrays.addsNumber(new int[] {4, 67, -88, 3333, 0}, 77));
		
	}
	@Test
	@Disabled
	void removeNumberTest() {
		int[] expected1 = {0, 1, 2, 3, 4, 5};
		assertArrayEquals(expected1, MyArrays.removeNumber(new int[] {0, 2, 1, 2, 3, 4, 5}, 1));
		int[] expected2 = {11, 22, 33, 44, 55, 66};
		assertArrayEquals(expected2, MyArrays.removeNumber(new int[] {11, 22, 33, 44, 55, 66, 7}, 6));
		int[] expected3 = {9, 8, 7, 6, 5};
		assertArrayEquals(expected3, MyArrays.removeNumber(new int[] {9, 8, 7, 6, 5}, 6));
//		int[] expected4 = {1, 2, 3, 4, 5};
//		assertArrayEquals(expected4, MyArrays.removeNumber(new int[] {1, 2, 3, 4, 5}, 0));
	}
	@Test
	@Disabled
	void insertSortedTest() {
		int[] expectedResult = {1, 2, 3, 4, 5};
		assertArrayEquals(expectedResult, MyArrays.insertSorted(new int[] {1, 2, 4, 5}, 3));
		int[] expectedResult1 = {1, 2, 3, 4, 5};
		assertArrayEquals(expectedResult1, MyArrays.insertSorted(new int[] {2, 3, 4, 5}, 1));
		int[] expectedResult2 = {1, 2, 3, 4, 5};
		assertArrayEquals(expectedResult2, MyArrays.insertSorted(new int[] {1, 2, 3, 4}, 5));
		
	}
	
	@Test
	@Disabled
	void verifyTest() {
		assertTrue(IsraelIdentity.verify(123456782));
		assertFalse(IsraelIdentity.verify(012345672));
		assertFalse(IsraelIdentity.verify(123456784));
		assertFalse(IsraelIdentity.verify(-123456784));
	}
	
	@Test
	@Disabled
	void generateRandomIdTest() {
		
		for (int i = 0; i < 10; i++) {
			assertTrue(IsraelIdentity.verify(IsraelIdentity.generateRandomId()));
		}
	}
	
	@Test
	
	void isOneSwapTestFalse() {
		
		int ar1[] = { 1, 2, 3, 10, -1, 5, 6 };
		int ar2[] = { 5, 1, 2, 4, 6, 10 };
		int ar3[] = { 1, 5, 2, 4, 3, 10 };
		int ar4[] = { 1, 3, 2, 5, 4, 10, 8 };
		int ar5[] = {1, 3, 20, 4, 5, 6, 10};
		int ar6[] = {1, 3, 20, 4, 5, 11, 2};
		
		assertFalse(MyArrays.isOneSwapForSorted(ar1));
		assertFalse(MyArrays.isOneSwapForSorted(ar2));
		assertFalse(MyArrays.isOneSwapForSorted(ar3));
		assertFalse(MyArrays.isOneSwapForSorted(ar4));
		assertFalse(MyArrays.isOneSwapForSorted(ar5));
		assertFalse(MyArrays.isOneSwapForSorted(ar6));		
	}
	@Test
	void isOneSwapTestTrue() {
		
		int ar1[] = { 10, 2, 3, 4, 1 };
		int ar2[] = { 1, 2, 4, 3, 5, 10 };
		int ar3[] = { 1, 2, 3, 10, 5, 4 };
		int ar4[] = { 1, 5, 3, 4, 2, 10 };
		int ar5[] = { 1, 2, 3, 4, 10, 5 };
		int ar6[] = { 2, 1, -3, 4, 5, 10 };
		int ar7[] = { 3, 2, 1, 4, 5, 6 };
		
		assertTrue(MyArrays.isOneSwapForSorted(ar1));
		assertTrue(MyArrays.isOneSwapForSorted(ar2));
		assertTrue(MyArrays.isOneSwapForSorted(ar3));
		assertTrue(MyArrays.isOneSwapForSorted(ar4));
		assertTrue(MyArrays.isOneSwapForSorted(ar5));
		assertTrue(MyArrays.isOneSwapForSorted(ar6));
		assertTrue(MyArrays.isOneSwapForSorted(ar7));		
	}
	@Test
	void binarySearchTest() {
		assertEquals(5, MyArrays.binarySearch(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
		assertEquals(0, MyArrays.binarySearch(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 0));
		assertEquals(9, MyArrays.binarySearch(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
		assertEquals(3, MyArrays.binarySearch(new int[] {0, 0, 0, 1, 4, 5, 6, 7, 8, 9}, 1));
		assertEquals(-9, MyArrays.binarySearch(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 9, 9}, 8));
		assertEquals(-1, MyArrays.binarySearch(new int[] {3, 3, 3, 3, 3, 3, 8, 9, 10}, 2));
		assertEquals(-5, MyArrays.binarySearch(new int[] {1, 2, 3, 4, 6, 7, 8, 9, 10}, 5));
		assertEquals(-1, MyArrays.binarySearch(new int[] {1, 4, 4, 4, 6, 6, 6, 9, 10}, 0));

	}
	

}
