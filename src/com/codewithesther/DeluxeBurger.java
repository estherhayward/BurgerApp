package com.codewithesther;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "Wagyu beef", "sesame", 14.95);
        super.addTopping("drink", 3.50);
        super.addTopping("chips", 4.50);
    }

    @Override
    public void addTopping(String name, double price) {
        System.out.println("Cannot add additional items for the deluxe burger");
    }
}
