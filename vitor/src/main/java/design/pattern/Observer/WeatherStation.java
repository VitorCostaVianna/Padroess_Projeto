package design.pattern.Observer;
/**
 * The WeatherStation class implements the Subject interface and represents a weather station
 * that maintains a list of observers and notifies them of any changes in weather measurements.
 * 
 * <p>This class provides methods to add and remove observers, notify all observers of changes,
 * and set new weather measurements (temperature and humidity).</p>
 */

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    
    private List<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(){
        observers.stream().forEach(observer -> observer.update(temperature, humidity));
    }

    public void setMeasurements(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyAllObservers();
    }
}
