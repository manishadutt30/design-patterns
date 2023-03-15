package DuckExample.Third;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyInterface =  new FlyWithWings();
        quackInterface =  new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is Mallard Duck reporting");
    }
}
