# pulselivetest

1. Rectangle Intersection

Give the following code, write an implementation of the intersection method that returns 

true if and only if the two rectangles overlap.

public class Rectangle

{

    // The co-ordinates of the top, left, bottom and right sides

    private double top;

    private double left;

    private double bottom;

    private double right;

    

    public Rectangle( double top, double left, double bottom, double right )

    {

        this.top = top;

        this.left = left;

        this.bottom = bottom;

        this.right = right;

    }

    

    public boolean intersects( Rectangle r )

    {

        return false;

    }

}

2. Packing

Write an implementation of the packBag method that returns the items that when placed 

into the bag contain the highest cumulative value without exceeding the maximum 

capacity.

import java.util.ArrayList;

import java.util.List;

public class BagOfHolding

{

    public static List<Item> packBag( List<Item> items, int capacity )

    {

        return new ArrayList<>();

    }

    

    public static class Item

    {

        // The value of the item

        private int value;

        // The size of the item, consumes capacity in the bag

        private int size;

        

        public Item( int value, int size )

        {

            this.value = value;

            this.size = size;

        }

    }

}
