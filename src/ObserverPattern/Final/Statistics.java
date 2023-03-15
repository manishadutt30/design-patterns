package ObserverPattern.Final;

public class Statistics implements Observer, DisplayElement{

    float maximumTemperature = 200;
    float minimunTemperature = 0;
    float averageTemperature = 0;
    int numReadings;
    WeatherData weatherData = new WeatherData();

    public Statistics(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (this.averageTemperature / numReadings)
                + "/" + this.maximumTemperature + "/" + this.minimunTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.averageTemperature =  this.averageTemperature + temperature;
        numReadings++;

        if (this.averageTemperature > this.maximumTemperature) {
            this.maximumTemperature = this.averageTemperature;
        }

        if (this.averageTemperature < this.minimunTemperature) {
            this.minimunTemperature = this.maximumTemperature;
        }

        display();

    }
}
