package test.week2;

import static org.junit.Assert.*;

import org.junit.Test;

import src.week2.FibonacciLastDigit;

public class FibonacciLastDigitTest {

	@Test
	public void test() {
		assertEquals(1, FibonacciLastDigit.fibList(239));
		assertEquals(5, FibonacciLastDigit.fibList(327305));
		
	}

}
