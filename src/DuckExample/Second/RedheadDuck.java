package DuckExample.Second;

public class RedheadDuck extends Duck{


    @Override
    public void display() {
        System.out.println("This is Redhead Duck reporting");
    }

    @Override
    public void fly() {
        System.out.println("Redhead Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Redhead Duck is quacking");
    }
}
