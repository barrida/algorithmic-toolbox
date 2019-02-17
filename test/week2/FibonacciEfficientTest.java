package week2;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class FibonacciEfficientTest {

	@Test
	public void testFibList() {
		assertEquals(0, FibonacciEfficient.fibList(0));
		assertEquals(1, FibonacciEfficient.fibList(1));
		assertEquals(55, FibonacciEfficient.fibList(10));
		assertEquals(4181, FibonacciEfficient.fibList(19));
	}

}
