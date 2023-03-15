package FactoryMethod.Third;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza(){
        name = "Chicago Veggie Pizza";
        dough = "Chicago Crust";
        sauce = "Chicago Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
