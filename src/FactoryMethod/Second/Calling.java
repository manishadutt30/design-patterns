package FactoryMethod.Second;

public class Calling {

    public static void main(String[] args){

        PizzaStore cheesePizza = new PizzaStore();
        cheesePizza.orderPizza("cheese");

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStoreImpl cheesePizzaNew = new PizzaStoreImpl(simplePizzaFactory);
        cheesePizzaNew.orderPizza("cheese");

    }
}
