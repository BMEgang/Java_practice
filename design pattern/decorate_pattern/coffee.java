package decorate_pattern;

public class coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
