package FactoryMethod.Third;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza(){
        name = "Chicago Pepperoni Pizza";
        dough = "Chicago Crust";
        sauce = "Chicago Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
