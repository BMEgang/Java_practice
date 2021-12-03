package Template_method_pattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("make pure soy milk");
        SoyMilk soyMilk = new PureSoyMilk();

        soyMilk.make();
    }
}
