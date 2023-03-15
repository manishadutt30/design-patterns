package FactoryMethod.First;

public class Pizza {

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
