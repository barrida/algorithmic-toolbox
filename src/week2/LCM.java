package week2;

import java.util.Scanner;

/**
 * Least Common Multiple
 * 
 * @author suleyman.yildirim
 *
 */
public class LCM {

	/**
	 * Naive solution of the least common multiple of two positive integers a and b is the least
	 * positive integer 𝑚 that is divisible by both a and b.
	 * 
	 * @param a positive integer a 
	 * @param b positive integer b
	 * @return least common multiple
	 */
	static long lcmNaive(long a, long b) {
		for (long l = 1; l <= (a * b); ++l)
			if (l % a == 0 && l % b == 0)
				return l;

		return a * b;
	}
	
	static long lcmEuclidian(long a, long b){
		long gcd = GreatestCommonDivisor.EuclidGcd(a, b);
		return (a*b) / gcd;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();

		System.out.println(lcmNaive(a, b));
	}
}
