package flyweight_pattern;

public class Client {
    public static void main(String[] args) {
        FlyWeightFactory FlyWeightFactory = new FlyWeightFactory();
        FlyWeight flyWeight = FlyWeightFactory.getFlyWeightCategory("news");

        flyWeight.use(new ExternalState("ganggang"));
    }
}
