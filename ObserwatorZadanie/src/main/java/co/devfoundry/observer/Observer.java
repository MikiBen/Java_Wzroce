package co.devfoundry.observer;

import co.devfoundry.menu.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
