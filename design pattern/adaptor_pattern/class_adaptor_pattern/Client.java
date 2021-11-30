package adaptor_pattern;

public class Client {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.charging(new voltage_adapter());
    }
}
