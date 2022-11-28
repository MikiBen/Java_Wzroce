package co.devfoundry.observer;

import co.devfoundry.menu.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio: Temperatura: " + weatherForecast.getTemperature() + " Preasure: " + weatherForecast.getPressure());
    }
}
