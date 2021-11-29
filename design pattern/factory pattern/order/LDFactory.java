package order;

import pizza.*;

public class LDFactory extends AbsFactory{
    pizza pizza = null;
    @Override
    public pizza createpizza(String Ordertype) {
        if (Ordertype.equals("cheese")) {
            pizza = new LDChessPizza();
            pizza.setName("london cheese pizza");
        } else if (Ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("london cheese pizza");
        }
        return pizza;
    }
}
