package ObserverPattern;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.register(currentConditions);
        System.out.println("++++++++++++++++++++++++++++++++");
        weatherData.setData(10f,100f,30.4f);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
