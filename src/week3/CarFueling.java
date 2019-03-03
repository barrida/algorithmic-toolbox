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
 * {200, 375, 550, 750}, 400
 * 
 * @author suleyman.yildirim
 *
 *
 */
public class CarFueling {

	/**
	 * 
	 * @param distance
	 *            Another city that is located distance miles away from your
	 *            home city
	 * @param tank
	 *            You can travel at most tank miles on a full tank
	 * @param stops
	 *            The gas stations at distances stop 1, stop 2, . . . , stop n
	 *            from your home city
	 * @return minimum number of refills
	 */
	public static int computeMinRefills(int distance, int tank, int[] stops) {
		int currentPosition = 0;
		int numRefills = 0;
		int endPosition = stops.length;
		int nextPosition = 0;
	

		while (currentPosition < endPosition) {
			nextPosition = findNextPosition(distance, stops, tank, currentPosition);
			if (nextPosition == -1) {
				return -1;
			}
			if (nextPosition < endPosition) {
				numRefills++;
				currentPosition = nextPosition;
			} else {
				currentPosition = endPosition;
			}
			
		}

		return numRefills;
	}

	/**
	 * Compute the position at which car will run out of gas
	 * 
	 * {200, 375, 550, 750}, 400 {1, 2, 5, 9}, 3
	 * 
	 * @return
	 */
	public static int findNextPosition(int distance, int[] stops, int tank, int currentPosition) {

		int nextPosition = currentPosition;

		if (stops[nextPosition] == stops[stops.length - 1]) {
			if ((stops[nextPosition] + tank) < distance) {
				return -1;
			}
			return ++nextPosition;
		}
		
		for (int i = (currentPosition + 1); i < stops.length; i++) {

			if ((currentPosition == 0) && (stops[i] <= tank)
					|| (currentPosition != 0) && ((stops[i] - stops[currentPosition]) <= tank)) {
				nextPosition++;
			}
		}
		
		if (currentPosition == nextPosition) {
			return -1;
		}

		return nextPosition;
	}

	/**
	 * Find the closest gas station before reaching that position
	 * 
	 * @return
	 */
	public static int findClosestGasStation(int[] stops, int tank, int currentPosition, int nextPosition) {
		int next = 0;
		for (int i = (currentPosition + 1); i < nextPosition; i++) {
			if (stops[i] - stops[currentPosition] <= tank) {
				next++;
			}
		}
		return next;
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
