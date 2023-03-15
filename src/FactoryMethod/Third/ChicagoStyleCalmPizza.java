package FactoryMethod.Third;

public class ChicagoStyleCalmPizza extends Pizza {

    public ChicagoStyleCalmPizza(){
        name = "Chicago Clam Pizza";
        dough = "Chicago Thin crust";
        sauce = "Chicago White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
