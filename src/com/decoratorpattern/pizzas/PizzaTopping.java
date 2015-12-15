package com.decoratorpattern.pizzas;

public abstract class PizzaTopping extends Pizza {
    Pizza basePizza;
    public PizzaTopping(Pizza pizza){
        basePizza= pizza;
    }
    @Override
    public String getDescription(){
        return basePizza.getDescription() + " " + this.description;
    }
    @Override
    public double getPrice(){
        return basePizza.getPrice() + this.prise;
    }
}
