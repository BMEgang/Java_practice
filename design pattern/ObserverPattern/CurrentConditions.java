package ObserverPattern;

public class CurrentConditions implements Observe{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("temperature is " + temperature);
        System.out.println("pressure is " + pressure);
        System.out.println("humidity is " + humidity);
    }
}
