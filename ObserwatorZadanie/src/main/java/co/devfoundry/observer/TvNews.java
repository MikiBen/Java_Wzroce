package co.devfoundry.observer;

import co.devfoundry.menu.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV: Temperatura: " + weatherForecast.getTemperature() + " Preasure: " + weatherForecast.getPressure());
    }
}
