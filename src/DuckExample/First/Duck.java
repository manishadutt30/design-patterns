package DuckExample.First;

public abstract class Duck {

    public void quack(){
        System.out.println("Duck is quacking");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public abstract void display();

    public void fly(){
        System.out.println("Duck is flying");
    }

    //public abstract void fly();
}
