package com.javaInterview.designPatters.factory.pizzas;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = PizzaFactory.createPizza("margherita");
        margherita.prepare();

        Pizza pepperoni = PizzaFactory.createPizza("pepperoni");
        pepperoni.prepare();

        Pizza veggie = PizzaFactory.createPizza("veggie");
        veggie.prepare();
    }
}
