package ObserverPattern;

public class Subject implements ISubject{
    @Override
    public void registerObserver() {
        System.out.println("Observer is registered");
    }

    @Override
    public void removeObserver() {
        System.out.println("Observer is removed");
    }

    @Override
    public void notifyObserver() {

    }
}
