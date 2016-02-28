package com.pulselive.test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Holder {
	int sum = 0;
}

public class BagOfHolding {

	// Function that creates a closure. 
	private static Function<Integer, Integer> accumulate() {
		Holder n = new Holder();
		return arg -> n.sum += arg;
	}

	//predicate which decides when to stop
	private static boolean isMaxCapacityReached(Integer currentCapacity,Integer maxCapacity) {
		return currentCapacity < maxCapacity;
	};

	public static List<Item> packBag(List<Item> items, int capacity){
		// currying function that is used to add the size of the item
		Function<Integer, Integer> x = accumulate();

		List<Item> collection = items
							.stream()
							.filter(e -> isMaxCapacityReached(x.apply(e.getSize()),capacity)).collect(Collectors.toList());

		return collection;

	}

	public static class Item{

		// The value of the item
		private int value;

		// The size of the item, consumes capacity in the bag
		private int size;

		public Item(int value, int size){
			this.value = value;
			this.size = size;
		}

		public int getSize() {
			return size;
		}

	}
}
