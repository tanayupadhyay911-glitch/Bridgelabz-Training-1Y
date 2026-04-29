package com.gla.GenericsAssignment.GenericsPro;

class Fruit {}

class Apple extends fruit {}

class Mango extends fruit {}

class FruitBox<T extends fruit> {
    T fruit;

    void add(T fruit) {
        this.fruit = fruit;
    }

    void display() {
        System.out.println("Fruit added: " + fruit.getClass().getSimpleName());
    }
}

class fruit {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();
    }
}
