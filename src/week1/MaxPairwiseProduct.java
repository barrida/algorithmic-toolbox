package src.week1;

import java.util.*;
import java.io.*;
import java.math.*;

public class MaxPairwiseProduct {

	public static BigInteger getMaxPairwiseProduct(int[] numbers) {

		// find first max value
		int maxIndex1 = getFirstMaxValue(numbers);

		// find second max value
		int maxIndex2 = getSecondMaxValue(numbers, maxIndex1);

		// multiply result
		return multiply(numbers, maxIndex1, maxIndex2);
	}

	/**
	 * @param numbers
	 * @param maxIndex1
	 * @param maxIndex2
	 * @return
	 */
	static BigInteger multiply(int[] numbers, int maxIndex1, int maxIndex2) {
		BigInteger multiply = BigInteger.valueOf(numbers[maxIndex1]).multiply(BigInteger.valueOf(numbers[maxIndex2]));
		return multiply;
	}

	/**
	 * @param numbers
	 * @param n
	 * @param maxIndex1
	 * @return
	 */
	public static int getSecondMaxValue(int[] numbers, int maxIndex1) {
		
		BigInteger n = BigInteger.valueOf(numbers.length);
		int maxIndex2 = -1;
		for (BigInteger second = BigInteger.valueOf(0); second.compareTo(n) < 0; second = second.add(BigInteger.ONE)) {
			int value = (int) second.intValue();
			if ((numbers[value] != numbers[maxIndex1]) && ((maxIndex2 == -1) || (numbers[value] > numbers[maxIndex2])))
				maxIndex2 = value;
		}
		return maxIndex2;
	}

	/**
	 * @param numbers
	 * @param n
	 * @return
	 */
     public static int getFirstMaxValue(int[] numbers) {
		BigInteger n = BigInteger.valueOf(numbers.length);
		int maxIndex1 = -1;
		for (BigInteger first = BigInteger.valueOf(0); first.compareTo(n) < 0; first = first.add(BigInteger.ONE)) {
			int value = (int) first.intValue();
			if ((maxIndex1 == -1) || (numbers[value] > numbers[maxIndex1]))
				maxIndex1 = value;
		}
		return maxIndex1;
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProduct(numbers));
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}