package FactoryMethod.Third;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    public void prepare() {
        System.out.println("Pizza is preparing");
    }

    public void bake(){
        System.out.println("Pizza is baking");
    }

    public void cut(){
        System.out.println("Pizza is cut");
    }

    public void box(){
        System.out.println("Pizza is boxing");
    }
}
