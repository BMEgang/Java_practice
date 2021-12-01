package Facade;

public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on()
    {
        System.out.println("dvd on");
    }

    public void off()
    {
        System.out.println("dvd off");
    }

    public void played()
    {
        System.out.println("dvd play");
    }
}
