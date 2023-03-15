package FactoryMethod.Second;

import FactoryMethod.Second.Pizza;

public class CheesePizza extends Pizza {

    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
