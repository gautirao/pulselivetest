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

	/*
	 * ^ X	(top,left)			 			                 * 	(top,left)			 
	 * | 	 	 .	.	.	.	.	.                        *   	 .	.	.	.	.	. 
	 * |      	 .                  .                        *       .                  .
	 * |		 .      2           .                        * 		 .        1         .
	 * |		 .					.                        * 		 .					.
	 * |		 .	.	.	.	.	.                        * 		 .	.	.	.	.	.
	 * |	 				(bottom,right)                  		 * 	 				(bottom,right)
	 * |
	 * |-----------------------------------------------------------------------------------------------> Y
	 * 
	 * */
	
	@Test
	public void should_negate_when_rectangle_to_left(){
		
		Rectangle rect1 = new Rectangle(10, 15, 5, 25);
		Rectangle rect2 = new Rectangle(10, 5, 5, 10);
		 
		assertFalse(rect1.intersects(rect2));
		
	}
	

	/*
	 * 	 * ^ X	(top,left)			                  
		 * | 	 	 .	.	.	.	.	.                        
		 * |      	 .                  .                        
		 * |		 .      1           .                        
		 * |		 .					.                        
		 * |		 .	.	.	.	.	.                        
		 * |	 					(bottom,right)                  
		 * |
		 * |
		 * |
		 * |	* 	(top,left)			 
		 * |    *    .	.	.	.	.	. 
		 * |    *    .                  .
		 * |    * 	 .        2         .
		 * |    * 	 .					.
		 * |    * 	 .	.	.	.	.	.
		 * |    * 	 				(bottom,right)
		 * |
		 * |
		 * |-----------------------------------------------------------------------------------------------> Y
		 
	 * 
	 * */
		
		@Test
		public void should_negate_when_rectangle_to_bottom(){
			
			Rectangle rect1 = new Rectangle(20, 5, 15, 10);
			Rectangle rect2 = new Rectangle(10, 5, 5, 10);
			assertFalse(rect1.intersects(rect2));
			
		}
		
		
		/*
		 * 	 * ^ X	(top,left)			                  
			 * | 	 	 .	.	.	.	.	.                        
			 * |      	 .                  .                        
			 * |		 .      2           .                        
			 * |		 .					.                        
			 * |		 .	.	.	.	.	.                        
			 * |	 					(bottom,right)                  
			 * |
			 * |
			 * |
			 * |	* 	(top,left)				
			 * |    *    .	.	.	.	.	. 
			 * |    *    .                  .
			 * |    * 	 .        1         .
			 * |    * 	 .					.
			 * |    * 	 .	.	.	.	.	.
			 * |    * 	  				(bottom,right)
			 * |
			 * |
			 * |-----------------------------------------------------------------------------------------------> Y
			 
		 * 
		 * */
			
			@Test
			public void should_negate_when_rectangle_to_top(){
				
				Rectangle rect1 = new Rectangle(10, 5, 5, 10);
				Rectangle rect2 = new Rectangle(20, 5, 15, 10);
				assertFalse(rect1.intersects(rect2));
				
			}
	
			
			@Test
			public void should_return_True_when_rectangle_overlap(){
				
				Rectangle rect1 = new Rectangle(5, 0, 0, 5);
				Rectangle rect2 = new Rectangle(5, 0, 0, 5);
				assertTrue(rect1.intersects(rect2));
				
			}
		
			@Test
			public void should_negate_when_rectangle_within(){
				
				Rectangle rect1 = new Rectangle(5, 0, 0, 5);
				Rectangle rect2 = new Rectangle(4, 1, 1, 3);
				assertTrue(rect1.intersects(rect2));
				
			}
		
			
			@Test
			public void should_return_True_when_rectangle_intersect(){
				
				Rectangle rect1 = new Rectangle(10, 5, 5, 15);
				Rectangle rect2 = new Rectangle(10, 10, 5, 20);
				 
				assertTrue(rect1.intersects(rect2));
				
			}
}
