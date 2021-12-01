package decorate_pattern;

public class Soy extends Decorator{
    public Soy(Drink obj) {

        super(obj);
        setDes("soy");
        setPrice(1.0f);
    }
}
