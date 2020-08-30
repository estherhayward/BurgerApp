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
            System.out.println("Maximum amount of four toppings reached.");
        }
    }

    private String getTopping(int i) {
        switch (i) {
            case 1:
                return this.toppingName1;
            case 2:
                return this.toppingName2;
            case 3:
                return this.toppingName3;
            case 4:
                return this.toppingName4;
        }
        return null;
    }

    private double getToppingPrice(int i) {
        switch (i) {
            case 1:
                return this.toppingPrice1;
            case 2:
                return this.toppingPrice2;
            case 3:
                return this.toppingPrice3;
            case 4:
                return this.toppingPrice4;
        }
        return 0;
    }

    private double hasTopping(double price) {
        for (int i = 1; i < 5; i++) {
            if (getTopping(i) != null) {
                System.out.println("  Added " + getTopping(i) +
                        " for an extra " + getToppingPrice(i));
                price+= getToppingPrice(i);
            }
        }
        return price;
    }

    public double showOrder() {
        double totalPrice = this.price;
        System.out.println("You've ordered the " + this.name + " burger on a " +
                this.breadType + " bun with " + this.meatTopping + ", the price is " + this.price);

        return totalPrice = hasTopping(totalPrice);
    }

}
