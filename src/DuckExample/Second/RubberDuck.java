package DuckExample.Second;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is Rubber Duck reporting");
    }

    @Override
    public void fly() {
        System.out.println("Rubber Duck can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Rubber Duck is squeaking");
    }
}
