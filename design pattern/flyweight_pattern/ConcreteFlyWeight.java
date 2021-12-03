package flyweight_pattern;

public class ConcreteFlyWeight extends FlyWeight{
    private String type = "";

    public ConcreteFlyWeight(String type) {
        this.type = type;
    }

    @Override
    public void use(ExternalState user) {
        System.out.println("the form of website publish: " + type + " user is " + user.getName());
    }
}
