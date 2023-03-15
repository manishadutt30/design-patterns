package FactoryMethod.Third;

public class NYStyleCalmPizza extends Pizza {

    public NYStyleCalmPizza(){

        System.out.println("NY style Calm Pizza");
        name = "NY Clam Pizza";
        dough = "NY Thin crust";
        sauce = "NY White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
