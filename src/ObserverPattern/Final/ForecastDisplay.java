package ObserverPattern.Final;

public class ForecastDisplay implements Observer, DisplayElement{
    float currentPressure = 29.2f;
    float lastPressure;

    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;

        display();
    }
}
