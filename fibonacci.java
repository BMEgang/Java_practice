public class fibonacci {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            System.out.print(fib(i) + " ");
        }

    }
    static int fib(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
