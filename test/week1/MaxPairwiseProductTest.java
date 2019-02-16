package week1;


import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import week1.MaxPairwiseProduct;

public class MaxPairwiseProductTest {


	MaxPairwiseProduct product;
	int numbers[]; 
	
	@Before
	public void setUp() throws Exception {
		 product = new MaxPairwiseProduct();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMaxPairwiseProduct() {
		numbers = new int[] {1,2,3};
		assertEquals(BigInteger.valueOf(6), MaxPairwiseProduct.getMaxPairwiseProduct(numbers));
		
		numbers = new int[] {100000000, 900000000};
		assertEquals(BigInteger.valueOf(90000000000000000L), MaxPairwiseProduct.getMaxPairwiseProduct(numbers));
		
		numbers = new int[] {2, 9, 3, 4, 9};
		assertEquals(BigInteger.valueOf(36), MaxPairwiseProduct.getMaxPairwiseProduct(numbers));

	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSecondMaxValue() {
		numbers = new int[] {1,2,3};
		assertEquals(2, numbers[MaxPairwiseProduct.getSecondMaxValue(numbers,MaxPairwiseProduct.getFirstMaxValue(numbers))]);
	}

	@Test
	public void testGetFirstMaxValue() {
		numbers = new int[] {1,2,3};
		assertEquals(3, numbers[MaxPairwiseProduct.getFirstMaxValue(numbers)]);
	}

}
