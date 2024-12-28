package com.javaInterview.designPatters.factory.pizzas;

public class MargheritaPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza...");
    }
}
