package week2;

import java.math.BigInteger;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		EuclidGcd(a, b);

	}

	/**
	 * Euclidian Algorithm for greatest common divisor
	 * 
	 * @param a
	 * @param b
	 */
	static int EuclidGcd(int a, int b) {
		if (b == 0)
			return a;
		int prime = (a % b);
		return EuclidGcd(b, prime);
	}

}
