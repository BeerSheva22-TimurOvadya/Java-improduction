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
		assertEquals('h', helloAr[0]);
		System.out.println((byte)helloAr[0]);
		assertEquals(5, hello.length());
		
		
	}
	
	
	@Test
	void isAnagramtTestTrue() {
		String str1 = "Hello World 123";
		String str2 = "World Hello 321";
		String str3 = "321dlroW ol leH";
		
		
		
		assertTrue(Strings.isAnagram(str1, str2));
		assertTrue(Strings.isAnagram(str1, str3));
		assertTrue(Strings.isAnagram(str2, str3));
	}
	
	@Test
	void isAnagramtTestFalse() {
		String str1 = "Hello World 123";
		String str2 = "HelloWorld123";
		String str3 = "hello world 123";
		String str4 = "Hell World 123";
		String str5 = "HELLO WORLD 123";
		String str6 = "qwertyQWERTYqwe";
		
		
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str3));
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str4));
		assertFalse(Strings.isAnagram(str1, str5));
		assertFalse(Strings.isAnagram(str1, str6));
	}
		
		
	

}
