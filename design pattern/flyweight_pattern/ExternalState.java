package flyweight_pattern;

public class ExternalState {
    private String Name;

    public ExternalState(String name) {
        Name = name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
