package io.javabrains.javabasics;

public class Rectangle {

    static int numOfRectangles;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        numOfRectangles++;
    }

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
       return this.height * this.width;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public int getNumOfRectangles() {
        return numOfRectangles;
    }

}
