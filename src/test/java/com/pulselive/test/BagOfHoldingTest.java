package com.pulselive.test;

import java.util.ArrayList;
import java.util.List;
import static com.pulselive.test.BagOfHolding.Item;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BagOfHoldingTest 
{
	List<Item> items = new ArrayList<Item>();

	@Before
	public void populateItems(){
		
		items.add(new Item(1,100));
		items.add(new Item(2,200));
		items.add(new Item(3,300));
	}
	
	
	@Test
	public void should_accumulate_values(){
		List<Item> packedBag = BagOfHolding.packBag(items,500);

		Integer totalSize = packedBag.stream().map(item -> item.getSize()).reduce(0,(e,c) -> e+c);
		
		assertTrue(totalSize < 500);
	}
	
	@Test
	public void should_return_empty_list(){
		List<Item> packedBag = BagOfHolding.packBag(items,0);
		assertTrue(packedBag.size() == 0);

	}
}
