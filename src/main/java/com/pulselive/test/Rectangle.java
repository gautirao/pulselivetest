package com.pulselive.test;

public class Rectangle {

    // The co-ordinates of the top, left, bottom and right sides
	/*
	 * 	(top,left)			
	 *   	 .	.	.	.	.	. 
	 *       .                  .
	 * 		 .                  .
	 * 		 .					.
	 * 		 .	.	.	.	.	.
	 * 						(bottom,right)
	 * */
	

    private double bottom;
    private double top;
    private double left;
    private double right;

    public Rectangle( double top, double left, double bottom, double right){
        this.bottom = bottom;
        this.top = top;
        this.left = left;
        this.right = right;
    }

    public boolean intersects( Rectangle r ){
    	
    	if(isPoint(this) || isPoint(r)){
    		throw new IllegalArgumentException("rectangle is a point and cannot be tested for intersection ");
    	}

    	 boolean intersects =    	( this.right < r.left) ||
    			 					( this.left > r.right) ||
    			 					( this.bottom > r.top) ||
    	 							( this.top < r.bottom) ;
    	 return !intersects;


    }

	private boolean isPoint(Rectangle r) {
		 
		return (r.top == r.bottom) && (r.left == r.right);
	}

}