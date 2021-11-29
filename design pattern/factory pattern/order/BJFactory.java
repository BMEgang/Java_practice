package order;

import pizza.*;

public class BJFactory extends AbsFactory{
    pizza pizza = null;
    @Override
    public pizza createpizza(String Ordertype) {
        if(Ordertype.equals("cheese"))
        {
            pizza = new BJCheesePizza();
            pizza.setName("beijing cheese pizza");
        }
        else if(Ordertype.equals("pepper"))
        {
            pizza = new BJPepperPizza();
            pizza.setName("beijing pepper pizza");
        }
        return pizza;
    }
}
