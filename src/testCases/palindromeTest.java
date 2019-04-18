package testCases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.regex.Matcher;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import files.palindrome;
import junit.framework.TestCase;

public class palindromeTest{
	int a[];
	int b[];
	
	@Before
	public void startUp() {
		a = new int[10];
		b = new int[10];
		for(int i=0;i<10;i++) {
			a[i] = i;
			b[i] = i-1;
		}
	}
	@After
	public void reset() {
		for(int i=0;i<10;i++) {
			a[i] = i+1;
			b[i] = i-1;
		}
	}
	@Test
	public void testString() {
		assertEquals("checking",palindrome.CheckPalindrome(new StringBuilder("liril")), true);
		assertEquals(palindrome.CheckPalindrome(new StringBuilder("12321")), true);
		assertEquals(palindrome.CheckPalindrome(new StringBuilder("!@#@!")), true);
		assertEquals(palindrome.CheckPalindrome(new StringBuilder("he eh")), true);
		assertArrayEquals("checking",a,b);
		assertArrayEquals(new Object[10], new Integer[10]);
	}

	@Test
	public void testString2() {
		assertEquals(palindrome.CheckPalindrome(new StringBuilder("123321")), true);
		assertEquals(palindrome.CheckPalindrome(new StringBuilder("he  eh")), true);
		assertNotEquals(palindrome.CheckPalindrome(new StringBuilder("hello")), true);
		assertNotNull(palindrome.CheckPalindrome(new StringBuilder()));
		assertArrayEquals(a,b);
	}
}
