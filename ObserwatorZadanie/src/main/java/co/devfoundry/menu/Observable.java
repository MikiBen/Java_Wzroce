package co.devfoundry.menu;

import co.devfoundry.observer.Observer;

public interface Observable {
    void registerObserver (Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
