package com.codewithesther;

public class HealthyBurger extends Burger {
    private String toppingName5;
    private double toppingPrice5;

    private String toppingName6;
    private double toppingPrice6;

    private int count = 1;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "brown rye", price);
    }

    @Override
    public void addTopping(String name, double price) {
        if (this.count < 5) {
            System.out.println("count: " + count);
            this.count++;
            super.addTopping(name, price);
        } else if (this.count < 7) {
            switch (this.count) {
                case 5:
                    System.out.println("count: " + this.count);
                    this.toppingName5 = name;
                    this.toppingPrice5 = price;
                    this.count++;
                    break;
                case 6:
                    System.out.println("count: " + this.count);
                    this.toppingName6 = name;
                    this.toppingPrice6 = price;
                    this.count++;
                    break;
            }
        } else {
                System.out.println("Maximum number of Toppings reached.");
            }
        }
    }

