package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean extraCheese;
    boolean extraToppings;
    boolean takeAway;
    int basePrice=0;
    int chese,topping,take;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)price=300;
        else price=400;
        basePrice=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheese)
        {
            extraCheese=true;
            price+=80;
            chese=80;
        }
    }

    public void addExtraToppings(){
        if(!extraToppings) {
            extraToppings = true;
            if(isVeg)
            {
                price+=70;
                topping=70;
            }
            else price+=120;
            topping=120;
        }
    }

    public void addTakeaway(){
        if(!takeAway)
        {
            takeAway=true;
            price+=20;
            take=20;
        }
    }

    public String getBill(){
        bill ="";
        bill+="Base Price Of The Pizza: "+basePrice+"\n";
        if(extraCheese)
        {
            bill+="Extra Cheese Added: "+chese+"\n";
        }
        if (extraToppings)
        {
            bill+="Extra Toppings Added: "+topping+"\n";
        }
        if(takeAway)
        {
            bill+="Paperbag Added: "+take+"\n";
        }
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
