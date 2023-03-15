package FactoryMethod.Third;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Cheese Pizza";
        dough = "Chicago Regular Crust";
        sauce = "Chicago Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
