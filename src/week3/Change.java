package src.week3;

import java.util.*;

/**
 * The goal in this problem is to find the minimum number of coins needed to
 * change the input value (an integer) into coins with denominations 1, 5, and
 * 10.
 * 
 * @author suleyman.yildirim
 *
 */
public class Change {
	public static int getChange(int m) {

		int output = 0;
		List<Integer> subProblemSet = new LinkedList<Integer>(Arrays.asList(10, 5, 1));

		while (subProblemSet.size() != 0) {
			int val = m / subProblemSet.get(0);
			int reminder = m % subProblemSet.get(0);
			output += val;
			m = reminder;
			subProblemSet.remove(0);
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
