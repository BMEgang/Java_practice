package bridge_pattern;

public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("xiaomi opens");
    }

    @Override
    public void close() {
        System.out.println("xiaomi closes" );
    }

    @Override
    public void call() {
        System.out.println("xiaomi calls");
    }
}
