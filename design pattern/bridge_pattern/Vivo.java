package bridge_pattern;

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo opens");
    }

    @Override
    public void close() {
        System.out.println("vivo closes" );
    }

    @Override
    public void call() {
        System.out.println("vivo calls");
    }
}
