/**
 * 
 */
package test.week3;

import static org.junit.Assert.*;
import org.junit.Test;
import src.week3.FractionalKnapsack;
import src.week3.FractionalKnapsack.Item;

/**
 * @author suleyman.yildirim
 *
 */
public class FractionalKnapsackTest {

	/**
	 * Test method for {@link src.week3.FractionalKnapsack#getOptimalValue(int, int[], int[])}.
	 */
	@Test
	public void testGetOptimalValue() {
		
		int[] values = {60, 100, 120};
		int[] weights = {20, 50 ,30};		
		assertEquals(180.0000, FractionalKnapsack.getOptimalValue(50, values, weights), 0.0000);

		int[] values2 = new int[] {500};
		int[] weights2 = new int [] {30};
		assertEquals(166.6667, FractionalKnapsack.getOptimalValue(10, values2, weights2), 0.0000);
	}

	/**
	 * Test method for {@link src.week3.FractionalKnapsack#calculateRatio(int[], int[])}.
	 */
	@Test
	public void testCalculateRatio() {
		int[] values = {60, 100, 120};
		int[] weights = {20, 50 ,30};
		Item[] ratio = FractionalKnapsack.calculateRatio(values, weights);
		
		assertNotNull(ratio);
		assertEquals(3,ratio[0].getRatio().intValue());
		assertEquals(2,ratio[1].getRatio().intValue());
		assertEquals(4,ratio[2].getRatio().intValue());
	}
	
	/**
	 * Test method for {@link src.week3.FractionalKnapsack#sortRatio(Item[])}.
	 */
	@Test
	public void testSortRatio(){
		int[] values = {60, 100, 120};
		int[] weights = {20, 50 ,30};
		Item[] ratio = FractionalKnapsack.calculateRatio(values, weights);
		FractionalKnapsack.sortRatio(ratio);
		
		assertEquals(4,ratio[0].getRatio().intValue());
		assertEquals(3,ratio[1].getRatio().intValue());
		assertEquals(2,ratio[2].getRatio().intValue());
	}

}
