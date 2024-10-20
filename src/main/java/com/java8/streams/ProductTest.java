package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductTest {

    public static void main(String[] args) {

        Product product = new Product();
        product.setProductName("Product 1");
        product.setProductPrice(1000);

        Product product1 = new Product();
        product1.setProductName("Product 2");
        product1.setProductPrice(2000);

        Product product2 = new Product();
        product2.setProductName("Product 3");
        product2.setProductPrice(3000);

        List<Product> productList = new ArrayList<Product>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);

        Long l1 = productList.stream().filter((x) -> x.getProductPrice() > 500).count();
        System.out.println(l1);

        List<Product> productList1 = Arrays.asList(new Product("A", 100),
                new Product("B", 200),
                new Product("C", 300));

        List<Product> resultProductList = productList.stream().filter((x) -> x.getProductPrice() > 2000).collect(Collectors.toList());
        System.out.println("resultProductList = " +resultProductList);


        Stream<Product> productStream = Stream.of(new Product("A", 100),
                new Product("B", 200),
                new Product("C", 300));

        List<Product> pList = productList1.stream()
                .filter(e -> e.getProductPrice() < 200)
                .collect(Collectors.toList());

        pList.forEach(System.out::println);

    }
}
