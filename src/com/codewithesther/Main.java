package com.codewithesther;

public class Main {

    public static void main(String[] args) {
//        Burger regular = new Burger("Regular", "bacon", "sesame", 12.50);
//        regular.addTopping("lettuce", 0.5);
//        regular.addTopping("tomato", 1);
//        regular.addTopping("mushrooms", 1.2);
//        regular.addTopping("onions", 0.9);
//        regular.addTopping("avocado", 2);
//        System.out.println("You're total order is " + regular.showOrder());
        Burger healthy = new HealthyBurger("soy bacon", 14.50);
        healthy.addTopping("lettuce", 0.5);
        healthy.addTopping("tomato", 1);
        healthy.addTopping("mushrooms", 1.2);
        healthy.addTopping("onions", 0.9);
        healthy.addTopping("avocado", 2);
        healthy.showOrder();

    }
}
