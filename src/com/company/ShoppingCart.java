package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//import java.util.concurrent.atomic.AtomicReference;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();


    //constructors
    public ShoppingCart(){};
    public ShoppingCart(ArrayList productList) {
        this.products = productList;
    }

    //methods
    public void addItem(Product item) {
        this.products.add(item);
    }

    @Override
    public String toString() {
        return "Cart contents: " + this.products + ", final cost: " + this.totalPrice();

    }

    public Double totalPrice() {
        Double summa = Double.valueOf(0.0);
        for (Product item : this.products) {
            summa += item.getPrice();
        }

        //4x3 discount
        Map<Product, Integer> productCounter = new HashMap<>();
        for (Product item :this.products) {
            if (productCounter.containsKey(item)) {
                productCounter.compute(item, (k,v) -> v += 1);
            } else {
                productCounter.put(item, 1);
            }
        }
        System.out.println("productCounter is: " + productCounter);

        for (Map.Entry<Product, Integer> entry : productCounter.entrySet() ) {
            int freeUnits = entry.getValue() / 4;
            System.out.println(entry.getKey().getName() + ": free units = " + freeUnits);
            summa -= entry.getKey().getPrice() * freeUnits;
        }

        System.out.println("before10% discount: " + summa);

        //10% discount for 5 items or more
        if (products.size() > 4) {
            summa = (summa * 0.9);
        }
        return summa;
    }


}
