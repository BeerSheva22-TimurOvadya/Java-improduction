import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObectTests {

	@Test
	void wrapperTest() {
		
		Integer a = 11;		
		Integer b = 11;
		assertEquals(a, b);
		Integer c =201;
		Integer d = 201;
		assertEquals(c, d);
		assertTrue (a == b);
		assertFalse (c == d);
		assertTrue(c.equals(d));
	}
	@Test
	void stringTest() {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals('h',helloAr[0]);
		System.out.println((byte)helloAr[0]);
		assertEquals(5, hello.length());
		
		
	}
	
	
	@Test
	void isAnagramtTest() {
		String testi = "Hello World 123";
		
		short ar[] = {1, 2, 5, 4, 5, 100, 9, 0x7fff, 1};
		assertTrue(MyArrays.isSum2(ar, (short)101));
		assertTrue(MyArrays.isSum2(ar, (short)11));
		assertTrue(MyArrays.isSum2(ar, (short)14));
		
		assertFalse(MyArrays.isSum2(ar, (short)8));
		assertFalse(MyArrays.isSum2(ar, (short)2000));
		assertTrue(MyArrays.isSum2(ar, (short)(0x7fff + 1)));
		
	}

}
