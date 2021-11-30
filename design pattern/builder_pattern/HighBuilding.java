package builder_pattern;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("high building build basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("high building build wall");
    }

    @Override
    public void buildroofed() {
        System.out.println("high building build roof");
    }
}
