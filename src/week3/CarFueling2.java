package src.week3;

import java.util.*;
import java.io.*;

/**
 * You are going to travel to another city that is located <code>distance</code>
 * miles away from your home city. Your can travel at most <code>tank</code>
 * miles on a full tank and you start with a full tank. Along your way, there
 * are gas stations at distances <code>stop 1, stop 2, . . . , stop n </code>
 * from your home city. What is the minimum number of refills needed?
 * 
 * 
 * Algorithm find_gas_stops() current position = start position; while
 * (current_position < end_position) compute the position at which car will run
 * out of gas. if (that position < end position) then find closest gas station
 * before reaching that position. output fill up gas at that gas station.
 * current position = that gas station location else current position = end
 * position; reached
 * 
 * 
 * @author suleyman.yildirim
 *
 *
 */
public class CarFueling2 {

	public static int computeMinRefills(int distance, int tank, int[] stops) {
		int i = 0;
		int distanceToTravel = stops[i];
		int numRefills=0;
		int n =stops.length;
		while (i < n && stops[i+1] != stops[n-1]) {
			distanceToTravel = stops[i];
			/* Greedy loop */
			while ((distanceToTravel <= distance) && (stops[i+1] != stops[n-1])) {
				numRefills++;
				distanceToTravel += stops[i+1];
				i++;
			}
			
			if (stops[i] + tank < distance) {
				numRefills = -1;
			}
		}
		return numRefills;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dist = scanner.nextInt();
		int tank = scanner.nextInt();
		int n = scanner.nextInt();
		int stops[] = new int[n];
		for (int i = 0; i < n; i++) {
			stops[i] = scanner.nextInt();
		}

		System.out.println(computeMinRefills(dist, tank, stops));
	}
}
