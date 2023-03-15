package FactoryMethod.Third;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza(){

        System.out.println("NY Style Veggie Pizza");
        name = "NY Veggie Pizza";
        dough = "NY Crust";
        sauce = "NY Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
