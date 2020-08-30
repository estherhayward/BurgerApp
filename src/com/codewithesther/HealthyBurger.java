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
            this.count++;
            super.addTopping(name, price);
        } else if (this.count < 7) {
            switch (this.count) {
                case 5:
                    this.toppingName5 = name;
                    this.toppingPrice5 = price;
                    this.count++;
                    break;
                case 6:
                    this.toppingName6 = name;
                    this.toppingPrice6 = price;
                    this.count++;
                    break;
            }
        } else {
                this.count++;
            System.out.println("count: " + this.count);
                System.out.println("Maximum number of toppings reached.");
            }
        }


    private String getTopping(int i) {
        switch (i) {
            case 5:
                return this.toppingName5;
            case 6:
                return this.toppingName6;
        }
        return null;
    }

    private double getToppingPrice(int i) {
        switch (i) {
            case 5:
                return this.toppingPrice5;
            case 6:
                return this.toppingPrice6;
        }
        return 0;
    }
    private double hasTopping(double price) {
        for (int i = 1; i < 7; i++) {
            if (getTopping(i) != null) {
                System.out.println("  Added " + getTopping(i) +
                        " for an extra " + getToppingPrice(i));
                price+= getToppingPrice(i);
            }
        }
        return price;
    }

    @Override
    public double showOrder() {
        double totalPrice = super.showOrder();

        return hasTopping(totalPrice);
    }

}

