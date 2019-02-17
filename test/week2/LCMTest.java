package test.week2;

import static org.junit.Assert.*;

import org.junit.Test;

import src.week2.LCM;

public class LCMTest {

	@Test
	public void testLcmNaive() {
		assertEquals(6, LCM.lcmNaive(2, 3));
		assertEquals(1933053046, LCM.lcmNaive(28851538, 1183019));
	}
	
	@Test
	public void testlcmEuclidian() {
		assertEquals(24, LCM.lcmEuclidian(6, 8));
		assertEquals(1933053046, LCM.lcmEuclidian(28851538, 1183019));
	}	
	

}
