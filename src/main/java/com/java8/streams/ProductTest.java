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
        productList.add(new Product("Product 4", 10000));

        // --------------------------------------------------------------------------------------------------
        Long l1 = productList.stream().filter((x) -> x.getProductPrice() > 2000).count();
        System.out.println("Number of Products where product price > 2000 are = " + l1);
        System.out.println();

        System.out.println("Products where product price > 2000 are: ");
        List<Product> resultProductList = productList.stream().filter((x) -> x.getProductPrice() > 2000).collect(Collectors.toList());
        System.out.println("ProductList = " + resultProductList);
        System.out.println();

        // --------------------------------------------------------------------------------------------------
        List<Product> productList1 = Arrays.asList(new Product("A", 100),
                new Product("B", 200),
                new Product("C", 300));

        List<Product> aList = productList1.stream()
                .filter(e -> e.getProductPrice() < 200)
                .collect(Collectors.toList());

        System.out.println("Products where product price < 200 are: ");
        aList.forEach(System.out::println);
        System.out.println();
        // --------------------------------------------------------------------------------------------------

        //Create a Stream directly rather that using a List
        Stream<Product> productStream = Stream.of(new Product("A", 100),
                new Product("B", 200),
                new Product("C", 300));

        System.out.println("Products where product price < 300 are: ");
        List<Product> pList = productStream.filter(p -> p.getProductPrice() < 300).collect(Collectors.toList());
        //Can print list in below 2 ways
        //pList.forEach(System.out::println);
        System.out.println("ProductList = " + pList);
    }
}

class Product {

    Product() {}

    public Product(String pName, int pPrice) {
        this.productName = pName;
        this.productPrice = pPrice;
    }

    private String productName;
    private int productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}