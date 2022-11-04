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
	void digitsNumberTest() {
		assertEquals(1, Numbers.getNdigits(9));
		assertEquals(2, Numbers.getNdigits(99));
		assertEquals(4, Numbers.getNdigits(02305));
		assertEquals(5, Numbers.getNdigits(12345));
		assertEquals(9, Numbers.getNdigits(987654321));
	}
	
	@Test
	void leadingZerosTest() {
		assertEquals(0, BitOperations.leadingZeros(-9));
		assertEquals(64, BitOperations.leadingZeros(0));
		assertEquals(43, BitOperations.leadingZeros(1234567)); 
		assertEquals(54, BitOperations.leadingZeros(1000)); 
		
	}
	
	@Test 
	void isHappyNumberTest() {
		assertEquals(true, Numbers.isHappyNumber(556655));
		assertEquals(true, Numbers.isHappyNumber(745565));
		assertEquals(true, Numbers.isHappyNumber(818818));
		assertEquals(true, Numbers.isHappyNumber(222222));
		assertEquals(false, Numbers.isHappyNumber(001001));
		assertEquals(false, Numbers.isHappyNumber(456789));
		assertEquals(false, Numbers.isHappyNumber(852369));		
		assertEquals(false, Numbers.isHappyNumber(8756));
		assertEquals(false, Numbers.isHappyNumber(7894561));
		
	}
	@Test
	void onesInNumberTest() {
		assertEquals(1, BitOperations.onesInNumber(1));
		assertEquals(0, BitOperations.onesInNumber(0));
		assertEquals(1, BitOperations.onesInNumber(64)); 
		assertEquals(64, BitOperations.onesInNumber(-1));
		assertEquals(10, BitOperations.onesInNumber(10236045)); 
	}

}
