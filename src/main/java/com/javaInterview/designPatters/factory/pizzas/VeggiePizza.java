package com.javaInterview.designPatters.factory.pizzas;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza...");
    }
}
