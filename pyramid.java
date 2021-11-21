public class pyramid {
    public static void main(String[] args) {
        pyranum(5);
    }
    public static void pyrastar(int n)
    {
        for(int i = 0; i < n; i++)
        {
            int space = n - i;
            int star = 2*i -1 ;
            System.out.print("\n");

            for(int j=0;j<space;++j)
            {
                System.out.print(" ");
            }

            for(int j=0;j<star;++j)
            {
                System.out.print("*");
            }

            for(int j=0;j<space;++j)
            {
                System.out.print(" ");
            }
        }
    }

    public static void pyranum(int n)
    {
        for(int i = 0; i < n; i++)
        {
            int space = n - i;
            int star = 2*i -1 ;
            System.out.print("\n");

            for(int j=0;j<space;++j)
            {
                System.out.print(" ");
            }

            for(int j=0;j<star;++j)
            {
                System.out.print(j);
            }

            for(int j=0;j<space;++j)
            {
                System.out.print(" ");
            }
        }
    }
}
