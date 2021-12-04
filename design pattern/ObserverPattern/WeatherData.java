package ObserverPattern;

import java.util.ArrayList;



public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observe> observers;

    public WeatherData(ArrayList<Observe> observers) {
        this.observers = new ArrayList<Observe>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public WeatherData() {
        observers = new ArrayList<Observe>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        datachange();
    }

    public void datachange()
    {
        notifyObserve();
    }

    @Override
    public void register(Observe observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observe observer) {
        if (observers.contains(observer))
        {
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObserve() {
        for(int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(temperature,pressure,humidity);
        }
    }
}
