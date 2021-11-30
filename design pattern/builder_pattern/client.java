package builder_pattern;

public class client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.construct();

        System.out.println("===================================");
        HighBuilding highBuilding = new HighBuilding();
        HouseDirector houseDirector1 = new HouseDirector(highBuilding);
        House house1 = houseDirector1.construct();
    }
}
