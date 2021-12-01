package Facade;

public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on()
    {
        System.out.println("popcorn marchine on");
    }

    public void off()
    {
        System.out.println("popcorn marchine off");
    }

    public void operate()
    {
        System.out.println("popcorn marchine operate");
    }
}
