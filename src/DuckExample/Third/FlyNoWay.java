package DuckExample.Third;

public class FlyNoWay implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("Duck is not able to fly");
    }
}
