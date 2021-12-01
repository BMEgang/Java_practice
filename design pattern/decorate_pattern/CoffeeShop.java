package decorate_pattern;

public class CoffeeShop {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());
    }
}
