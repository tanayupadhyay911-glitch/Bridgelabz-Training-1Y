package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();

    void addItem(T item){
        items.add(item);
    }

    void removeItem(T item){
        items.remove(item);
    }

    void displayItems(){
        for(T item : items){
            System.out.println(item);
        }
    }
}

class Electronics {
    public String toString(){
        return "Electronics Item";
    }
}

class Clothing {
    public String toString(){
        return "Clothing Item";
    }
}

class generics {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics());

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing());

        electronicsCart.displayItems();
        clothingCart.displayItems();
    }
}
