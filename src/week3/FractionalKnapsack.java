package src.week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/***
 * The goal of this code problem is to implement an algorithm for the fractional
 * knapsack problem
 * 
 * Calculate ratio of each item (v[i]/w[i]) 
 * (Optional) Sort the ratios in descending order
 * Choose the item with highest ratio
 * If it fits knapsack, take all value of it Otherwise take so much as to fill the knapsack Return total
 * value and amounts taken
 * 
 * @author suleyman.yildirim
 *
 */
public class FractionalKnapsack {
	
	// item class 
    static class Item { 
        Integer value;
        Integer weight;
        Double ratio;
          
        // item value function 
        public Item(int value, int weight, double ratio){ 
            this.weight = weight; 
            this.value = value; 
            this.ratio = ratio; 
        } 
  
    } 

	/**
	 * Choose the item with highest ratio. If it fits knapsack, take all value
	 * of it. Otherwise take so much as to fill the knapsack Return total value
	 * and amounts taken
	 * 
	 * @param capacity
	 * @param values
	 * @param weights
	 * @return
	 */
	public static double getOptimalValue(int capacity, int[] values, int[] weights) {
		double result = 0;
		double value = 0.0;
		double weight = 0.0;
		
		Item[] ratios = calculateRatio(values, weights);
		sortRatio(ratios);
		
		for (int i = 0; i < ratios.length; i++) {

			weight = ratios[i].weight;
			value = ratios[i].value;
//			System.out.println("value: " + value);
//			System.out.println("weight: " + weight);
//			System.out.println("ratio " + ratios[i].ratio);
			if (capacity == 0)
				return result;

			if (weight <= capacity) {
				capacity -= weight;
				result += value;
			} else {
				result += (capacity / weight) * value;
				capacity -= (capacity / weight) * weight;
			}
		}
		
		
		//System.out.println(result);
		return Double.parseDouble(String.format("%.4f", result));
	}

	/**
	 * (Optional) Sort the ratios in descending order
	 * @param ratios
	 */
	private static void sortRatio(Item[] ratios) {
        Arrays.sort(ratios, new Comparator<Item>() { 
            @Override
            public int compare(Item o1, Item o2) { 
                return o2.ratio.compareTo(o1.ratio); 
            } 
        }); 
	}
	

	/**
	 * Calculate ratio of each item (v[i]/w[i])
	 * 
	 * @param values
	 * @param weights
	 * @return
	 */
	public static Item[] calculateRatio(int[] values, int[] weights) {
		Item[] items = new Item[weights.length];
		for (int i = 0; i < weights.length; i++) {
			items[i] = new Item(values[i], weights[i], (double) ((double) values[i] / (double) weights[i]));
		}
		return items;
	}
	
	/**
	 * 
	 * @param values
	 * @param weights
	 * @return
	 */
	// public static Map<Double, Integer[][]> calculateRatio(int[] values, int[]
	// weights) {
	//
	// Integer[][] item = new Integer[values.length][2];
	// // Map<Double,Integer[][]> ratioMap = new HashMap<Double,Integer[][]>();
	//
	// Map<Double, Integer[][]> ratioMap = new TreeMap<Double,
	// Integer[][]>().descendingMap();
	//
	// for (int i = 0; i < weights.length; i++) {
	// item[i][0] = values[i];
	// item[i][1] = weights[i];
	// //System.out.println(values[i] + " : " + weights[i]);
	// // System.out.println( values[i] / weights[i] );
	// ratioMap.put(Double.valueOf((double) (values[i] / weights[i])), item);
	// }
	//
	// // Map<Double,Integer[][]> treeMap = new
	// // TreeMap<>(ratioMap).descendingMap();
	//
	//// for (Double str : ratioMap.keySet()) {
	//// System.out.println("ker: " + str);
	//// }
	//
	// return ratioMap;
	// }

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		System.out.println(getOptimalValue(capacity, values, weights));
	}
}
