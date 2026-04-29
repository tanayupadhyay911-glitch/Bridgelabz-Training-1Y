package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

abstract class WarehouseItem {}


class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {

    List<T> items = new ArrayList<>();

    void addItem(T item){
        items.add(item);
    }

    void display(){
        for(T item : items){
            System.out.println(item.getClass().getSimpleName());
        }
    }

    static void showAll(List<? extends WarehouseItem> list){
        for(WarehouseItem item : list){
            System.out.println(item.getClass().getSimpleName());
        }
    }
}
