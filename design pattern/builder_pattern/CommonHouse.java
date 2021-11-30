package builder_pattern;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("normal house build basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("normal house build walls");
    }

    @Override
    public void buildroofed() {
        System.out.println("normal house roofed");
    }
}
