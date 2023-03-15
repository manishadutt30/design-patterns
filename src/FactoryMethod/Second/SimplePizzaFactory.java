package FactoryMethod.Second;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){

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

        return pizza;
    }
}
