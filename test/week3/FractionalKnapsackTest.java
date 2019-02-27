/**
 * 
 */
package test.week3;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

import src.week3.FractionalKnapsack;

/**
 * @author suleyman.yildirim
 *
 */
public class FractionalKnapsackTest {

	/**
	 * Test method for {@link src.week3.FractionalKnapsack#getOptimalValue(int, int[], int[])}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testGetOptimalValue() {
		int[] values = {60, 100, 120};
		int[] weights = {20, 50 ,30};
		double value = FractionalKnapsack.getOptimalValue(50, values, weights);
		System.out.println(value);
		assertEquals(180.0000, value, 0.0000);
		double val2 = FractionalKnapsack.getOptimalValue(10, new int[] {500}, new int [] {30});
		System.out.println(val2);
		assertEquals(166.6667, val2, 0.0000);
	}

	/**
	 * Test method for {@link src.week3.FractionalKnapsack#calculateRatio(int[], int[])}.
	 */
	@Test
	public void testCalculateRatio() {
		int[] values = {60, 100, 120};
		int[] weights = {20, 50 ,30};
		//Map<Double, Integer[][]> calculateRatio = FractionalKnapsack.calculateRatio(values, weights);
		//assertNotNull(calculateRatio);
		

	}

}
