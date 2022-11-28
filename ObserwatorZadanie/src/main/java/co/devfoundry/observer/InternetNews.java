package co.devfoundry.observer;

import co.devfoundry.menu.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Interner: Temperatura: " + weatherForecast.getTemperature() + " Preasure: " + weatherForecast.getPressure());
    }
}
