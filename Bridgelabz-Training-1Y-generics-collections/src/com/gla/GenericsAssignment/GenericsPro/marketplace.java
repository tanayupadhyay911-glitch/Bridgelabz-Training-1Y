package com.gla.GenericsAssignment.GenericsPro;

class marketplace<T> {
    T category;
    double price;

    marketplace(T category, double price){
        this.category = category;
        this.price = price;
    }

    double getPrice(){
        return price;
    }
}

class Discount {

    static <T extends marketplace> void applyDiscount(T product, double percentage){
        product.price -= product.price * percentage / 100;
    }
}
