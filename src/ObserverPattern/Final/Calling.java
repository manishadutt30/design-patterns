package ObserverPattern.Final;

public class Calling {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =  new CurrentConditionsDisplay(weatherData);
        Statistics statistics = new Statistics(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 45);
    }
}
