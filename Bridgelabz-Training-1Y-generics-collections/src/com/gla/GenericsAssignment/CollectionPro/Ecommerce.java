package com.gla.GenericsAssignment.CollectionPro;
import java.util.*;

class Order {

    int id;
    String name;

    Order(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Order)) return false;
        Order o1 = (Order)o;
        return id == o1.id;
    }

    public String toString(){
        return id + " " + name;
    }
}

public class Ecommerce {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1,"Laptop"));
        orders.add(new Order(2,"Phone"));
        orders.add(new Order(1,"Laptop")); // duplicate

        Set<Order> unique = new HashSet<>(orders);

        Queue<Order> queue = new LinkedList<>(unique);

        Stack<Order> failed = new Stack<>();

        while(!queue.isEmpty()){

            Order o = queue.poll();

            System.out.println("Processing " + o);

            if(o.id == 2){
                failed.push(o);
            }
        }

        System.out.println("Retrying Failed Orders");

        while(!failed.isEmpty()){
            System.out.println("Retry " + failed.pop());
        }
    }
}
