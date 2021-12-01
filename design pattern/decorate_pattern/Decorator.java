package decorate_pattern;

public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();// self price plus coffee price
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + " && " + obj.getDes();
    }
}
