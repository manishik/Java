package com.javaInterview.designPatters.factory.shapes;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        RoundedShapeFactory roundedShapeFactory = new RoundedShapeFactory();

        roundedShapeFactory.getShape("square").draw();
        roundedShapeFactory.getShape("rectangle").draw();
        roundedShapeFactory.getShape("Circle").draw();
        roundedShapeFactory.getShape("").draw();
        roundedShapeFactory.getShape("Triangle").draw();

    }
}
