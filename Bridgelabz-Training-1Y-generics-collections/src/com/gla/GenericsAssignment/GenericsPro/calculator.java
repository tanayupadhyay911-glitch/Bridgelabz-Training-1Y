package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

class Product {
    double price;

    Product(double price){
        this.price = price;
    }

    double getPrice(){
        return price;
    }
}

class Mobile extends marketplace {
    Mobile(double price){
        super(price);
    }
}

class Laptop extends marketplace {
    Laptop(double price){
        super(price);
    }
}

class PriceCalculator {

    static double calculateTotal(List<? extends marketplace> items){
        double total = 0;

        for(marketplace p : items){
            total += p.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(
                new Mobile(10000),
                new Mobile(20000)
        );

        System.out.println(calculateTotal(mobiles));
    }
}
