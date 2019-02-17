package week2;

import java.util.Scanner;

/**
 * The greatest common divisor GCD(a, b) of two non-negative integers a and b
 * (which are not both equal to 0) is the greatest integer d that divides both a
 * and b.
 * 
 * @author suleyman.yildirim
 *
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		EuclidGcd(a, b);

	}

	/**
	 * Euclidian Algorithm for greatest common divisor
	 * 
	 * @param a
	 * @param b
	 */
	static long EuclidGcd(long a, long b) {
		if (b == 0)
			return a;
		return EuclidGcd(b, a % b);
	}

}
