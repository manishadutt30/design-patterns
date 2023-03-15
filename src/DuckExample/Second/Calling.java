package DuckExample.Second;

public class Calling {

    public static void main(String[] args){

       Duck mallardDuck = new MallardDuck();
       mallardDuck.swim();
       mallardDuck.display();
       mallardDuck.quack();
       mallardDuck.fly();

       Duck redheadDuck = new RedheadDuck();
       redheadDuck.swim();
       redheadDuck.display();
       redheadDuck.quack();
       redheadDuck.fly();

       Duck rubberDuck = new RubberDuck();
       redheadDuck.swim();
       redheadDuck.display();
       redheadDuck.quack();
       redheadDuck.fly();
    }
}
