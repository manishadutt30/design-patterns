package ObserverPattern.Final;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {

        for(Observer item: observers){
            item.update(this.temperature, this.humidity, this.pressure);
        }

    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
