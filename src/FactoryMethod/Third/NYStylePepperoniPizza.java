package FactoryMethod.Third;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza(){

        System.out.println("NY Style Pepperoni Pizza");
        name = "NY Pepperoni Pizza";
        dough = "NY Crust";
        sauce = "NY Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
