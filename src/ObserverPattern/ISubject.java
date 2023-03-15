package ObserverPattern;

public interface ISubject {

    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
