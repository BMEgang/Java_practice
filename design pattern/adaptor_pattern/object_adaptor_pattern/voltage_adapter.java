package adaptor_pattern;

public class voltage_adapter implements voltage_5v{
    private voltage_220v voltage220v;

    public voltage_adapter(voltage_220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5V() {
        int dstv = 0;
        if(null != voltage220v)
        {
            int src= voltage220v.output220v();
            dstv = src / 44;
        }

        return dstv;
    }
}
