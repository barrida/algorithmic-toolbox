package test.week3;

import static org.junit.Assert.*;

import org.junit.Test;

import src.week3.CarFueling;

public class CarFuelingTest {


	@Test
	public void testNextPosition() {
		assertEquals(1, CarFueling.findNextPosition(950, new int []{200, 375, 550, 750}, 400,0));
		assertEquals(3, CarFueling.findNextPosition(950, new int []{200, 375, 550, 750}, 400,1));
		//assertEquals(-1, CarFueling.findNextPosition(950, new int []{200, 375, 550, 750}, 400,3));
		assertEquals(1, CarFueling.findNextPosition(10, new int []{1, 2, 5, 9}, 3, 0));
		assertEquals(2, CarFueling.findNextPosition(10, new int []{1, 2, 5, 9}, 3, 1));
		//assertEquals(-1, CarFueling.computeMinRefills(10, 3, new int []{1, 2, 5, 9}));
	}
	
	@Test
	public void testInvalidNextPosition() {
		assertEquals(-1, CarFueling.findNextPosition(950, new int []{200, 375, 550, 750}, 400,3));
		assertEquals(-1, CarFueling.findNextPosition(10, new int []{1, 2, 5, 9}, 3, 2));
	}

	
	@Test
	public void testComputeMinRefills() {
		assertEquals(2, CarFueling.computeMinRefills(950, 400, new int []{200, 375, 550, 750}));
		assertEquals(-1, CarFueling.computeMinRefills(10, 3, new int []{1, 2, 5, 9}));
		assertEquals(-1, CarFueling.computeMinRefills(700, 200, new int []{100, 200, 300, 400}));
	}

	
	
}
