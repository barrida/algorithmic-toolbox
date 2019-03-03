package test.week3;

import static org.junit.Assert.*;

import org.junit.Test;

import src.week3.CarFueling;
import src.week3.CarFueling2;

public class CarFueling2Test {

	@Test
	public void testComputeMinRefills() {
		assertEquals(2, CarFueling2.computeMinRefills(950, 400, new int []{200, 375, 550, 750}));
		assertEquals(-1, CarFueling2.computeMinRefills(10, 3, new int []{1, 2, 5, 9}));
		assertEquals(-1, CarFueling2.computeMinRefills(700, 200, new int []{100, 200, 300, 400}));

	}

}
