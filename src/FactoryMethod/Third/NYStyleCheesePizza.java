package FactoryMethod.Third;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){

        System.out.println("NY Style Cheese Pizza");
        name = "NY Cheese Pizza";
        dough = "NY Regular Crust";
        sauce = "NY Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
