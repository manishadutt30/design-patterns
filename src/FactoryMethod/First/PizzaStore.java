package FactoryMethod.First;

import FactoryMethod.First.Pizza;

public class PizzaStore {

    public Pizza orderPizza(){
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
