package DuckExample.Second;

public abstract class Duck implements FlyInterface, QuackInterface{

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public abstract void display();
}
