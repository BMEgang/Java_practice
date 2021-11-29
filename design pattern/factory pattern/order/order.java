package order;

import com.sun.org.apache.xpath.internal.operations.Or;
import pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class order {
    AbsFactory factory;

    public order(AbsFactory Factory)
    {
        pizza pizza = null;
        this.factory = Factory;
        String OrderType;

        do {
            OrderType = getType();
            pizza = this.factory.createpizza(OrderType);

            if(pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else {
                System.out.println("order fail");
                break;
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza ÷÷¿‡:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
