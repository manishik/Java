package com.javaInterview.designPatters;

//Liskov's Substitution Principle (LSP)
//Derived types must be completely substitutable for their base types.
//the below example violates LSP (Square class violates by changing)
public class LspTest {

    private static Rectangle getNewRectangle() {
        // it can be an object returned by some factory ...
        return new Square();
    }

    public static void main(String args[]) {
        Rectangle rectangle = LspTest.getNewRectangle();

        rectangle.setWidth(5);
        rectangle.setHeight(10);
        // user knows that it's a rectangle.
        // It assumes that he's able to set the width and height as for the base
        // class

        System.out.println("Area of Rectangle = " + rectangle.getArea());
        // now he's surprised to see that the area is 100 instead of 50.
    }
}

class Rectangle {
    protected int rectangle_width;
    protected int rectangle_height;

    public void setWidth(int width) {
        rectangle_width = width;
    }

    public void setHeight(int height) {
        rectangle_height = height;
    }

    public int getWidth() {
        return rectangle_width;
    }

    public int getHeight() {
        return rectangle_height;
    }

    public int getArea() {
        return rectangle_width * rectangle_height;
    }
}


class Square extends Rectangle {

    // Height & Width are same for a Square
    public void setWidth(int width) {
        rectangle_width = width;
        rectangle_height = width;
    }

    public void setHeight(int height) {
        rectangle_width = height;
        rectangle_height = height;
    }

}
