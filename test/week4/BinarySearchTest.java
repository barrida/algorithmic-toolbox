package test.week4;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import src.week4.BinarySearch;

public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		
		//Arrange
		int a[] = { 1, 5, 8, 12, 13 };
		int b[] = { 8, 1, 23, 1, 11 };
		int[] binarySearch = new int[5];
		
		//Act
		for (int i = 0; i < b.length; i++) {
			binarySearch[i] = BinarySearch.binarySearch(a, b[i]);
			System.out.print(binarySearch[i] + " ");
		}
		
		//Assert
		assertEquals("[2, 0, -1, 0, -1]", Arrays.toString(binarySearch));

	}

	@Test
	public void testLinearSearch() {
		//Arrange

		int a[] = { 1, 5, 8, 12, 13 };
		int b[] = { 8, 1, 23, 1, 11 };
		int[] linearSearch = new int[5];
		
		//Act
		for (int i = 0; i < b.length; i++) {
			linearSearch[i] = BinarySearch.linearSearch(a, b[i]);
			System.out.print(linearSearch[i] + " ");
		}
		
		//Assert
		assertEquals("[2, 0, -1, 0, -1]", Arrays.toString(linearSearch));

	}

}
