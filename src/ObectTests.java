import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ObectTests {

	@Test
	@Disabled
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
	@Disabled
	void stringTest() {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals('h', helloAr[0]);
		System.out.println((byte)helloAr[0]);
		assertEquals(5, hello.length());
		
		
	}
	
	
	@Test
	void isAnagramt_1_TestTrue() {
		String str1 = "Hello World 123™";
		String str2 = "World Hello 321™";
		String str3 = "321dlroW ol leH™";
		
		
		
		assertTrue(Strings.isAnagram_1(str1, str2));
		assertTrue(Strings.isAnagram_1(str1, str3));
		assertTrue(Strings.isAnagram_1(str2, str3));
	}
	
	@Test
	void isAnagramt_1_TestFalse() {
		String str1 = "Hello World 123";
		String str2 = "Hello World 123©";
		String str3 = "hello world 123";
		String str4 = "Hell World 123";
		String str5 = "HELLO WORLD 123";
		String str6 = "qwertyQWERTYqwe";
		
		
		assertFalse(Strings.isAnagram_1(str1, str2));
		assertFalse(Strings.isAnagram_1(str1, str3));
		assertFalse(Strings.isAnagram_1(str1, str2));
		assertFalse(Strings.isAnagram_1(str1, str4));
		assertFalse(Strings.isAnagram_1(str1, str5));
		assertFalse(Strings.isAnagram_1(str1, str6));
	}
		
	@Test
	void isAnagramt_2_TestTrue() {
		String str1 = "Hello World 123™";
		String str2 = "World Hello 321™";
		String str3 = "321dlroW ol leH™";
		
		
		
		assertTrue(Strings.isAnagram_2(str1, str2));
		assertTrue(Strings.isAnagram_2(str1, str3));
		assertTrue(Strings.isAnagram_2(str2, str3));
	}
	
	@Test
	void isAnagramt_2_TestFalse() {
		String str1 = "Hello World 123";
		String str2 = "Hello World 123©";
		String str3 = "hello world 123";
		String str4 = "Hell World 123";
		String str5 = "HELLO WORLD 123";
		String str6 = "qwertyQWERTYqwe";
		
		
		assertFalse(Strings.isAnagram_2(str1, str2));
		assertFalse(Strings.isAnagram_2(str1, str3));
		assertFalse(Strings.isAnagram_2(str1, str2));
		assertFalse(Strings.isAnagram_2(str1, str4));
		assertFalse(Strings.isAnagram_2(str1, str5));
		assertFalse(Strings.isAnagram_2(str1, str6));
	}
	

}
