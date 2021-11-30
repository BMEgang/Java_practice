package builder_pattern;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //constructor

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //set method

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //how to process the stream of building house
    public House construct()
    {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildroofed();
        return houseBuilder.buildhouse();
    }
}
