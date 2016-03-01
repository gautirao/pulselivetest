package com.pulselive.test;

import java.util.ArrayList;
import java.util.List;
import static com.pulselive.test.BagOfHoldingNew.Item;
public class BagOfHoldingNew {

	
	public static List<Item> packBag(List<Item> items, int capacity){
	
		int totalSize = 0;
		List<Item> collectedItems = new ArrayList<Item>();
		
		for (Item item : items) {
			int accumulate = totalSize +  item.size;
			if(accumulate < capacity){
				totalSize += accumulate;
				collectedItems.add(item);
			}
		}
		return collectedItems;

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
