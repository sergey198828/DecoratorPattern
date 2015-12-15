package com.decoratorpattern.pizzas;

public class MozzarellaTopping extends PizzaTopping {
    public MozzarellaTopping(Pizza pizza) {
        super(pizza);
        this.description="Mozzarella";
        this.prise = 0.25;
    }
}
