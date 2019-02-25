package test.week3;

import static org.junit.Assert.*;

import org.junit.Test;

import src.week3.Change;

public class ChangeTest {

	@Test
	public void testGetChange() {
		assertEquals(2,Change.getChange(2));
		assertEquals(6,Change.getChange(28));
	}

}
