package FactoryMethod.Second;

import FactoryMethod.Second.Pizza;
import org.w3c.dom.Node;

public class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("greek")){
            pizza = new ClamPizza();
        }else if(type.equals("pepperoniPizza")){
            pizza = new PepperoniPizza();
        }else{
            pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
