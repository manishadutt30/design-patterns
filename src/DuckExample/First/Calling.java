package DuckExample.First;

public class Calling {

    public static void main(String[] args){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        //mallardDuck.fly();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
        //redheadDuck.fly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
        //rubberDuck.fly();
    }
}
