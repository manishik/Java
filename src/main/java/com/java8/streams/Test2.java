package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product ("P1", 286));
        products.add(new Product ("P2", 512));
        products.add (new Product ("P3", 268));
        products.add(new Product ("P4", 258));
        products.add (new Product ("P5", 431));
        products.add(new Product ("P6", 289));

        Product product = products
                .stream()
                .reduce(products.get(0),
                        (a, b) -> a.getProductPrice() < b.getProductPrice() ? a : b);
        System.out.println(product);
    }

}
