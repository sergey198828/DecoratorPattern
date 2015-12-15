package com.decoratorpattern.pizzas;

public abstract class Pizza {
    protected String description;
    protected double prise;
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return prise;
    }
}