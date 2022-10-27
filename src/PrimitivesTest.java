import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PrimitivesTest {

	@Test
	@Disabled
	void dataTypeTest() {
		int b = 10;
	//	var a = 20; // var тоже типа int,
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
		// три метода дать значение, третьей цифры, второй цифры, и первой цифры
		int number = 123;
		assertEquals(3, getThirdDigit(number));
		assertEquals(2, getSecondDigit(number));
		assertEquals(1, getFirstDigit(number));
		
	}
	private int getFirstDigit(int number) {return number / 100; }
	
	private int getSecondDigit(int number) {return (number / 10) % 10; }
	
	private int getThirdDigit(int number) {return number %10; }

}


