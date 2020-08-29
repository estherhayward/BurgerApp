package com.codewithesther;

public class Burger {
    private String name;
    private String meatTopping;
    private String breadType;
    private double price;

    private int count;

    private String toppingName1;
    private double toppingPrice1;

    private String toppingName2;
    private double toppingPrice2;

    private String toppingName3;
    private double toppingPrice3;

    private String toppingName4;
    private double toppingPrice4;

    public Burger(String name, String meatTopping, String breadType, double price) {
        this.name = name;
        this.meatTopping = meatTopping;
        this.breadType = breadType;
        this.price = price;
    }

    public void addTopping(String name, double price) {
        if (count < 4) {
            count++;
            switch (count) {
                case 1:
                    this.toppingName1 = name;
                    this.toppingPrice1 = price;
                    break;
                case 2:
                    this.toppingName2 = name;
                    this.toppingPrice2 = price;
                    break;
                case 3:
                    this.toppingName3 = name;
                    this.toppingPrice3 = price;
                    break;
                case 4:
                    this.toppingName4 = name;
                    this.toppingPrice4 = price;
                    break;
            }
        } else {
            System.out.println("Maximum amount of toppings reached.");
        }
    }

}
