package com.javaInterview.designPatters.factory.shapes;

public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else {
            if (shapeType.equalsIgnoreCase("")) {
                return new Shape() {
                    @Override
                    public void draw() {
                        System.out.println("Empty shape");
                    }
                };
            }
        }
        return new Shape() {
            @Override
            public void draw() {
                System.out.println("Undefine shape");
            }
        };
    }
}
