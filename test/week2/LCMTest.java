package week2;

import static org.junit.Assert.*;

import org.junit.Test;

public class LCMTest {

	@Test
	public void testLcmNaive() {
		assertEquals(6, LCM.lcmNaive(2, 3));
		assertEquals(1933053046, LCM.lcmNaive(28851538, 1183019));
	}

}
