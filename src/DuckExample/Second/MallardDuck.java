package DuckExample.Second;

public class MallardDuck extends Duck implements FlyInterface{
    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying");
    }

    @Override
    public void display() {
        System.out.println("This is Mallard Duck reporting");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck is quacking");
    }
}
