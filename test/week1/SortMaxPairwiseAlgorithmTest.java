
package test.week1;
import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.week1.SortMaxPairwiseAlgorithm;

public class SortMaxPairwiseAlgorithmTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMaxPairwiseProduct() {
		assertEquals(BigInteger.valueOf(6), SortMaxPairwiseAlgorithm.getMaxPairwiseProduct(new int[] {1,2,3}));
		assertEquals(BigInteger.valueOf(90000000000000000L), SortMaxPairwiseAlgorithm.getMaxPairwiseProduct(new int[] {100000000, 900000000}));

	}

}
