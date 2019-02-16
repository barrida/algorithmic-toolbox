package week2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GreatestCommonDivisorTest {

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
	public void testEuclidGcd() {
		assertEquals(7, GreatestCommonDivisor.EuclidGcd(7, 28));
		assertEquals(61232, GreatestCommonDivisor.EuclidGcd(3918848, 1653264));

	}

}
