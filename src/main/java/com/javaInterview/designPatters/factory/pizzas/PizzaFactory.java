package com.javaInterview.designPatters.factory.pizzas;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "margherita":
                return new MargheritaPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
