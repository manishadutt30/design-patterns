package DuckExample.Third;

public class Calling {

    public static void main(String[] args){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();


    }
}
