package com.decoratorpattern.pizzas;

public class TomatoSauseTopping extends PizzaTopping {
    public TomatoSauseTopping(Pizza pizza) {
        super(pizza);
        this.description="Tomato sause";
        this.prise = 0.55;
    }
}
