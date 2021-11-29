package pizza;

public abstract class pizza {
    private String name;
    public abstract void prepare();

    public void bake()
    {
        System.out.println("bake it");
    }

    public void cut()
    {
        System.out.println("cut ot");
    }

    public void box()
    {
        System.out.println("box it");
    }

    public void setName(String name) {
        this.name = name;
    }
}
