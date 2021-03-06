package src.week3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/***
 * The goal of this code problem is to implement an algorithm for the fractional
 * knapsack problem
 * 
 * 1. Calculate ratio of each item (v[i]/w[i]) 
 * 2. Sort the ratios in descending order
 * 3. Choose the item with highest ratio
 * 4. If it fits knapsack, take all value of it Otherwise take so much as to fill the knapsack
 * 5. Return total value and amounts taken
 * 
 * @author suleyman.yildirim
 *
 */
public class FractionalKnapsack {
	
	// item class 
    public static class Item { 

		Integer value;
        Integer weight;
        Double ratio;
          
        // item value function 
        public Item(int value, int weight, double ratio){ 
            this.weight = weight; 
            this.value = value; 
            this.ratio = ratio; 
        } 
        
        public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Double getRatio() {
			return ratio;
		}

		public void setRatio(Double ratio) {
			this.ratio = ratio;
		}

  
    } 

	/**
	 * Choose the item with highest ratio. As Item class is sorted by ratio
	 * descended, we iterate through array of Item objects. If it fits knapsack,
	 * take all value of it and continiue with the next item. Otherwise take so
	 * much as to fill the knapsack.
	 * 
	 * @param capacity
	 * @param values
	 * @param weights
	 * @return Return total value
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
		
		return Double.parseDouble(String.format("%.4f", result));
	}

	/**
	 * Sort the ratios in descending order
	 * @param ratio
	 */
	public static void sortRatio(Item[] ratio) {
        Arrays.sort(ratio, new Comparator<Item>() { 
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
