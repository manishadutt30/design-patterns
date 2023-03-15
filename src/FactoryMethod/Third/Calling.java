package FactoryMethod.Third;

public class Calling {

    public static void main(String[] args){

        PizzaStore nyStyleCheesePizza = new NYPizzaStore();
        nyStyleCheesePizza.orderPizza("cheese");
    }
}
