package com.pulselive.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_testing_against_a_point(){
		Rectangle rect1 = new Rectangle(0, 5, 0, 5);
		Rectangle rect2 = new Rectangle(1, 1, 1, 1);
		assertFalse(rect1.intersects(rect2));
	}
	
	/*
	 * ^ X	(top,left)					                      	(top,left)			 
	 * | 	 	 .	.	.	.	.	.                           	 .	.	.	.	.	. 
	 * |      	 .                  .                                .                  .
	 * |		 .      1           .                         		 .        2         .
	 * |		 .					.                         		 .					.
	 * |		 .	.	.	.	.	.                         		 .	.	.	.	.	.
	 * |	 	 			(bottom,right)                    	 				(bottom,right)
	 * |
	 * |-----------------------------------------------------------------------------------------------> Y
	 * 
	 * */
	
	@Test
	public void should_negate_when_rectangle_to_right(){

	Rectangle rect1 = new Rectangle(10, 5, 0, 5);
	Rectangle rect2 = new Rectangle(10, 20, 0, 30);
	assertFalse(rect1.intersects(rect2));
		
	}

	 

	
	
}
