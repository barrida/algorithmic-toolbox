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
	static long lcmNaive(int a, int b) {
		for (long l = 1; l <= (long) a * b; ++l)
			if (l % a == 0 && l % b == 0)
				return l;

		return (long) a * b;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcmNaive(a, b));
	}
}
