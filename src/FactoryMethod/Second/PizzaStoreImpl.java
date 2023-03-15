package FactoryMethod.Second;

public class PizzaStoreImpl {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStoreImpl(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){

        Pizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
