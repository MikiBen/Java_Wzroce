package co.devfoundry.menu;

import co.devfoundry.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{

    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure)
    {
        this.pressure = pressure;
        this.temperature = temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: registeredObservers)
        {
            observer.updateForecast(this);
        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void setRegisteredObservers(Set<Observer> registeredObservers) {
        this.registeredObservers = registeredObservers;
    }

    public void updateForecast( int temperature, int pressure)
    {
        setPressure(pressure);
        setTemperature(temperature);
        notifyObservers();
    }
}
