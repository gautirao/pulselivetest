package com.pulselive.test;

import java.util.ArrayList;
import java.util.List;
import static com.pulselive.test.BagOfHoldingNew.Item;
public class BagOfHoldingNew {

	
	public static List<Item> packBag(List<Item> items, int capacity){
	
		int capacityLeft = capacity;
		List<Item> collectedItems = new ArrayList<Item>();
		
		for (Item item : items) {
			int accumulate = capacityLeft - item.size;
			
			if(isPositive(accumulate)){
				capacityLeft = accumulate;
				collectedItems.add(item);
			}
		}
		return collectedItems;

	}

	private static boolean isPositive(int accumulate) {
		return accumulate > 0;
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
