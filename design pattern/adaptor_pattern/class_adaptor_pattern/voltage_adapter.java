package adaptor_pattern;

public class voltage_adapter extends voltage_220v implements voltage_5v{

    @Override
    public int output5V() {
        int src= output220v();
        int dstv = src / 44;
        return dstv;
    }
}
