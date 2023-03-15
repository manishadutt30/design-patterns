package FactoryMethod.Third;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(type.equals("clam")){
            return new NYStyleCalmPizza();
        }else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
