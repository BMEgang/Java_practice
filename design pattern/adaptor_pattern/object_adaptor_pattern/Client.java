package adaptor_pattern;

public class Client {
    public static void main(String[] args) {
        phone phone = new phone();
        voltage_adapter voltage_adapter = new voltage_adapter(new voltage_220v());
        phone.charging(voltage_adapter);
    }
}
