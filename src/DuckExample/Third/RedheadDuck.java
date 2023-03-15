package DuckExample.Third;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        flyInterface = new FlyWithWings();
        quackInterface =  new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is Redhead Duck id reporting");
    }
}
