package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    /*Tv tv1 = new Tv ("Sony", 1, 50);
        System.out.println(tv1);
        tv1.changeVolume(13);
        System.out.println(tv1);
        tv1.changeVolume(-3);
        System.out.println(tv1);
        tv1.changeVolume(54);
        System.out.println(tv1);
        tv1.changeVolume((-113));
        System.out.println(tv1);*/

    Product prod1 = new Product("chair",30.0);
        //System.out.println(prod1);
        Product prod2 = new Product("sofa", 200.0);
        Product prod3 = new Product("lamp", 40.0);

    ArrayList productList1 = new ArrayList<Product>();
    ShoppingCart cart1 = new ShoppingCart(productList1);
    cart1.addItem(prod1);
    //System.out.println(cart1);

    ArrayList productList2 = new ArrayList<Product>();
    productList2.add(prod1);
    productList2.add(new Product("blanket", 5.5));
    ShoppingCart cart2 = new ShoppingCart(productList2);
        //System.out.println(cart2);
        cart2.addItem(prod2);
        cart2.addItem(prod2);
        cart2.addItem(prod2);
        cart2.addItem(prod2);
        cart2.addItem(prod3);
        cart2.addItem(new Product("table", 100.0));
        //System.out.println(cart2);

        ShoppingCart cart3 = new ShoppingCart(new ArrayList<Product>());
        cart3.addItem(prod1);
        cart3.addItem(prod1);
        cart3.addItem(prod2);
        cart3.addItem(prod3);
        //System.out.println(cart3);

        ShoppingCart cart4 = new ShoppingCart();
        cart4.addItem(prod1);
        cart4.addItem(prod1);
        cart4.addItem(prod2);
        cart4.addItem(prod2);
        cart4.addItem(prod2);
        cart4.addItem(prod2);
        cart4.addItem(prod3);
        System.out.println(cart4);
    }
}

