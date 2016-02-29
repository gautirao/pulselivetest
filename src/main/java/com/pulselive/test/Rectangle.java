package com.pulselive.test;

public class Rectangle {

    // The co-ordinates of the top, left, bottom and right sides
	/*
	 * 	(maxX,minY)			(maxX,maxY)
	 *   	 .	.	.	.	.	. 
	 *       .                  .
	 * 		 .                  .
	 * 		 .					.
	 * 		 .	.	.	.	.	.
	 * 	(minX,minY)			(minX,maxY)
	 * */
	

    private double minx;
    private double maxX;
    private double minY;
    private double maxY;

    public Rectangle( double minX, double maxX, double minY, double maxY ){
        this.minx = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    public boolean intersects( Rectangle r ){
    	
    	if(isPoint(this) || isPoint(r)){
    		throw new IllegalArgumentException("rectangle is a point and cannot be tested for intersection ");
    	}

    	return false;

    }

	private boolean isPoint(Rectangle r) {
		 
		return (r.minx == r.minY) && (r.maxX == r.maxY);
	}

}