package adaptor_pattern;

public class phone {
    public void charging(voltage_5v voltage)
    {
        if (voltage.output5V() == 5)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
