package src.week2;

import java.util.Scanner;

/**
 * Efficient algorithm to find Fibonacci number
 * 
 * @author suleyman.yildirim
 *
 */
public class FibonacciEfficient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(fibList(n));
	}

	public static long fibList(long n) {
		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		long f1 = 0;
		long f2 = 1;
		long fibionacci = 0;

		for (long i = 1; i < n; ++i) {
			fibionacci = f1 + f2;
			f1 = f2;
			f2 = fibionacci;
		}

		return f2;

	}

}
