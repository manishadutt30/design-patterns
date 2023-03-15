package DuckExample.Third;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        setFlyInterface(new FlyNoWay());
        setQuackInterface(new MuteQuack());
    }

    @Override
    public void display() {

    }
}
