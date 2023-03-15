package DuckExample.Third;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyInterface = new FlyNoWay();
        quackInterface = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("This is Rubber Duck reporting");
    }
}
