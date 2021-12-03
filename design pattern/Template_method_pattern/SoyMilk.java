package Template_method_pattern;

public abstract class SoyMilk {
    final void make()
    {
        select();
        if(CustomewantCondiments())
        {
            addCondiments();
        }
        soak();
        beat();
    }

    void select()
    {
        System.out.println("first, select fresh bean");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("soar bean and conditionals for three hours");
    }

    void beat()
    {
        System.out.println("forth, beat the bean and conditionals");
    }
    //hook method
    boolean CustomewantCondiments(){
        return true;
    }
}
