package DuckExample.Third;

public abstract class Duck {

    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public Duck(){

    }

    public void setFlyInterface(FlyInterface flyInterface){
        this.flyInterface = flyInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface){
        this.quackInterface = quackInterface;
    }

    public abstract void display();

    public void performFly(){
        flyInterface.fly();
    }

    public void performQuack(){
        quackInterface.quack();
    }

    public void swim(){
        System.out.println("Even Duck can swim");
    }
}
