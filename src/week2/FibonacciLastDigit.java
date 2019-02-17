package src.week2;

import java.util.Scanner;

/**
 * Find last digit of n-th Fibonacci number
 * @author suleyman.yildirim
 *
 */
public class FibonacciLastDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fibList(n));
	}

	/**
	 * 	
	 * @param n
	 * @return fibonacci number
	 */
	public static long fibList(int n) {
		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		int f1 = 0;
		int f2 = 1;
		int fibionacci = 0;

		for (long i = 1; i < n; ++i) {
			fibionacci = (f1 + f2) % 10;
			f1 = f2;
			f2 = fibionacci;
		}

		return f2;

	}

}
