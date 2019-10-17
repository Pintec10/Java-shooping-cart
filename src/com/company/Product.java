package com.company;

public class Product {
    private String name;
    private Double price;

    public Product() {};
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return this.name + ": cost = " +
                this.price;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
