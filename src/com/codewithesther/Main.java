package com.codewithesther;

public class Main {

    public static void main(String[] args) {
        Burger john = new Burger("Delicious Burger", "bacon", "sesame", 12.50);
        john.addTopping("lettuce", 0.5);
        john.addTopping("tomato", 1);
        john.addTopping("mushrooms", 1.2);
        john.addTopping("onions", 0.9);
        john.addTopping("avocado", 2);

    }
}
