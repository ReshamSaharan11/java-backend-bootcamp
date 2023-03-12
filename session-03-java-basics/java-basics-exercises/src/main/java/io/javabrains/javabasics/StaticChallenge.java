package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle R1  = new Rectangle(10,5);
        Rectangle R2 = new Rectangle(4,7);
        int area1 = R1.getArea();
        int area2 = R2.getArea();
        int perimeter1 = R1.getPerimeter();
        int perimeter2 = R2.getPerimeter();
        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);
        System.out.println("perimeter1 = " + perimeter1);
        System.out.println("perimeter2 = " + perimeter2);

        System.out.println(Rectangle.numOfRectangles);

    }
}
