package com.driver;

public class Pizza {

    boolean extraCheese;
    boolean extraToppings;
    boolean takeAway;
    int basePrice = 0;
    int chese, topping, take;
    private int price;
    private final Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) price = 300;
        else price = 400;
        basePrice = price;
        this.takeAway=false;
        this.extraToppings=false;
        this.extraCheese=false;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheese) {
            extraCheese = true;
            price += 80;
            chese = 80;
        }
    }

    public void addExtraToppings() {
        if (!extraToppings) {
            extraToppings = true;
            if (isVeg) topping = 70;
            else topping = 120;
            price += topping;
        }
    }

    public void addTakeaway() {
        if (!takeAway) {
            takeAway = true;
            price += 20;
            take = 20;
        }
    }

    public String getBill() {
        bill = "";
        bill += "Base Price Of The Pizza: " + basePrice + "\n";
        if (extraCheese) {
            bill += "Extra Cheese Added: " + chese + "\n";
        }
        if (extraToppings) {
            bill += "Extra Toppings Added: " + topping + "\n";
        }
        if (takeAway) {
            bill += "Paperbag Added: " + take + "\n";
        }
        bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
