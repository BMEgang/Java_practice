package builder_pattern;

public abstract class HouseBuilder {
    House house = new House();

    abstract public void buildBasic();
    abstract public void buildWalls();
    abstract public void buildroofed();

    public House buildhouse()
    {
        return house;
    }

}
