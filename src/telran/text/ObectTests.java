package telran.text;
import static org.junit.jupiter.api.Assertions.*;

import static telran.text.Strings.*;
import org.junit.jupiter.api.*;


class ObectTests {

	@Test
	@Disabled
	void wrapperTest() {

		Integer a = 11;
		Integer b = 11;
		assertEquals(a, b);
		Integer c = 201;
		Integer d = 201;
		assertEquals(c, d);
		assertTrue(a == b);
		assertFalse(c == d);
		assertTrue(c.equals(d));
	}

	@Test
	@Disabled
	void stringTest() {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals('h', helloAr[0]);
		System.out.println((byte) helloAr[0]);
		assertEquals(5, hello.length());

	}

	@Test
	@Disabled
	void isAnagramtTest() {
		String word = "Hello World 123";
		assertTrue(Strings.isAnagram(word, "Hello World 123"));
		assertTrue(Strings.isAnagram(word, "321 dlroW olleH"));
		assertTrue(Strings.isAnagram(word, "World olelH 231"));
		assertTrue(Strings.isAnagram(word, "2 drlllWooHe1 3"));

		assertFalse(Strings.isAnagram(word, ""));
		assertFalse(Strings.isAnagram(word, "1Hello World 123"));
		assertFalse(Strings.isAnagram(word, "Hallo World 123"));
		assertFalse(Strings.isAnagram(word, "hello world 123"));
		assertFalse(Strings.isAnagram(word, "HELLO WORLD 123"));
		assertFalse(Strings.isAnagram(word, "HelloWorld123"));
		assertFalse(Strings.isAnagram(word, "Qwert Yqwert 123"));
		assertFalse(Strings.isAnagram(word, "HellWor23"));
		assertFalse(Strings.isAnagram(word, "HHHeeellllllooo    WWWooorrrlllddd   111222333"));
		assertFalse(Strings.isAnagram(word, "Hello World 123 Hello World 123 Hello World 123"));
	}

	@Test
	@Disabled
	void sortStringNumbersTest() {
		String[] array0 = { "0", "0", "0", "0", "0", "0", "0", "0" };
		Strings.sortStringNumbers(array0);
		assertArrayEquals(new String[] { "0", "0", "0", "0", "0", "0", "0", "0" }, array0);

		String[] array1 = { "127", "126", "88", "1", "0", "-1", "-128", "-127" };
		Strings.sortStringNumbers(array1);
		assertArrayEquals(new String[] { "-128", "-127", "-1", "0", "1", "88", "126", "127" }, array1);

		String[] array2 = { "127", "-128", "127", "-128", "127", "-128", "127", "-128" };
		Strings.sortStringNumbers(array2);
		assertArrayEquals(new String[] { "-128", "-128", "-128", "-128", "127", "127", "127", "127" }, array2);

		String[] array3 = { "120", "127", "10", "0", "-1", "111", "125", "100" };
		Strings.sortStringNumbers(array3);
		assertArrayEquals(new String[] { "-1", "0", "10", "100", "111", "120", "125", "127" }, array3);

		String[] array4 = { "0", "-111", "1", "-10", "-128", "-1", "-127", "-100" };
		Strings.sortStringNumbers(array4);
		assertArrayEquals(new String[] { "-128", "-127", "-111", "-100", "-10", "-1", "0", "1" }, array4);
	}

	@Test
	
	void javaVariabletest() {
		assertTrue("java".matches(Strings.javaNameExp()));
		assertFalse("1java".matches(Strings.javaNameExp()));
		assertFalse("_".matches(Strings.javaNameExp()));
		assertTrue("__".matches(Strings.javaNameExp()));
		assertTrue("JaVa_1_2".matches(Strings.javaNameExp()));
		assertTrue("$".matches(Strings.javaNameExp()));
		assertFalse("$ _".matches(Strings.javaNameExp()));
	}

	@Test
	@Disabled
	void ipV4Octet() {
		assertTrue("000".matches(Strings.ipV4Octet()));
		assertTrue("0".matches(Strings.ipV4Octet()));
		assertTrue("1".matches(Strings.ipV4Octet()));
		assertTrue("99".matches(Strings.ipV4Octet()));
		assertTrue("005".matches(Strings.ipV4Octet()));
		assertTrue("192".matches(Strings.ipV4Octet()));
		assertTrue("255".matches(Strings.ipV4Octet()));
		
		assertFalse("2561".matches(Strings.ipV4Octet()));
		assertFalse("256".matches(Strings.ipV4Octet()));
		assertFalse("-88".matches(Strings.ipV4Octet()));
		assertFalse("_".matches(Strings.ipV4Octet()));
		assertFalse("__".matches(Strings.ipV4Octet()));
		assertFalse("$_".matches(Strings.ipV4Octet()));
		assertFalse(".".matches(Strings.ipV4Octet()));		
		assertFalse(" ".matches(Strings.ipV4Octet()));
		assertFalse("".matches(Strings.ipV4Octet()));
		assertFalse(" 44".matches(Strings.ipV4Octet()));

	}
	
	@Test
	@Disabled	
	void ipV4Test() {
		
		assertTrue("000.000.000.000".matches(Strings.ipV4()));	
		assertTrue("111.111.111.111".matches(Strings.ipV4()));	
		assertTrue("255.255.255.255".matches(Strings.ipV4()));		
		assertTrue("255.255.255.0".matches(Strings.ipV4()));	
		assertTrue("255.255.0.0".matches(Strings.ipV4()));
		assertTrue("255.0.0.0".matches(Strings.ipV4()));
		assertTrue("0.0.0.0".matches(Strings.ipV4()));	
		assertTrue("192.168.1.1".matches(Strings.ipV4()));	
		assertTrue("8.8.8.8".matches(Strings.ipV4()));
		assertTrue("0.0.192.66".matches(Strings.ipV4()) );	
		
		assertFalse("192.168.1.1.".matches(Strings.ipV4()));
		assertFalse("192.   .1.1.".matches(Strings.ipV4()));
		assertFalse("192.258.1.1".matches(Strings.ipV4()));
		assertFalse("192...1.".matches(Strings.ipV4()));
		assertFalse("192.168.1".matches(Strings.ipV4()));
		assertFalse("aaa.168.1.1".matches(Strings.ipV4()));
		assertFalse("_.168.1.1".matches(Strings.ipV4()));
	}
	
	@Test
	
	void ipV4TestTrue() {
		assertTrue("1.2.3.4".matches(ipV4()));
		assertTrue("199.249.255.209".matches(ipV4()));
		assertTrue("99.99.99.05".matches(ipV4()));
	}
	
	@Test
	@Disabled
	void ipV4Testfalse() {
		assertFalse("*.19.10.10".matches(ipV4()));
		assertFalse("256.19.10.10".matches(ipV4()));
		assertFalse("300.19.10.10".matches(ipV4()));
		assertFalse("255.19.10".matches(ipV4()));
		assertFalse("255.19.10.10.".matches(ipV4()));
		assertFalse("255.19".matches(ipV4()));
		
		
	}
	
	@Test
	
	void computeExpressionTest() {
		assertEquals(10.5, computeArithmenticExpression("(2 + (2 + (1 * 2 + 0.5)))", null, null));
		assertEquals(10.5, computeArithmenticExpression("2 + (2 + 1) * 2 + 0.5", null, null));
		assertEquals(10.5, computeArithmenticExpression("(2 + (2 + (1) * 2) + 0.5)", null, null));
		assertEquals(10.5, computeArithmenticExpression("A + 2 + 1 * 2 + 0.5", new double[] {2}, new String[] {"A"}));
		assertEquals(12.5, computeArithmenticExpression("a + 2 + c + 1 * 2 + 0.5", new double[] {2,1}, new String[] {"a", "c"}));
		assertEquals(2, computeArithmenticExpression("a + (b / d - c) * e + f", new double[] {2, 3, 1, 5, 0, 2}, new String[] {"a", "b","c" ,"d" ,"e" ,"f" ,}));
		
		
		assertTrue(Double.isNaN(computeArithmenticExpression("2 + (2 + 1)) * 2 + 0.5", null, null)));
		assertTrue(Double.isNaN(computeArithmenticExpression("(2 + (2 + 1 * 2 + 0.5", null, null)));
		assertTrue(Double.isNaN(computeArithmenticExpression("2 (+ 2 + 1 * 2) + 0.5", null, null)));
		assertTrue(Double.isNaN(computeArithmenticExpression("2 # ++ 10",  null, null)));
		assertTrue(Double.isNaN(computeArithmenticExpression("a + 2 + c + 1 * 2 + d23", new double[] {2,1}, new String[] {"a", "c"})));
		assertTrue(Double.isNaN(computeArithmenticExpression("a + 2 + c + 1d * 2 + ", new double[] {2,1}, new String[] {"a", "c"})));
		assertTrue(Double.isNaN(computeArithmenticExpression("a+(b-c)^d*f", new double[] {2,5,1,0,4}, new String[] {"a", "b", "c", "d","f"})));
	}
	
	@Test
    public void checkBracesTest() {
        assertTrue(checkBraces("()"));        
        assertTrue(checkBraces("(33(123)333)"));    
        assertTrue(checkBraces("((()))"));
        assertTrue(checkBraces("(ass(2zx(qwe)wer)wer)"));
        
        assertFalse(checkBraces("("));
        assertFalse(checkBraces(")"));
        assertFalse(checkBraces(")(")); 
        assertFalse(checkBraces("(()"));
        assertFalse(checkBraces("())"));
        
    }
	
	
 
    
}
