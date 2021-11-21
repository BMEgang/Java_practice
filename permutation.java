public class permutation {
    public static void main(String[] args) {
        System.out.println(per(10,3));
    }

    public static int per(int n, int r)
    {
        return fac(n) / fac(n - r);
    }

    public static int fac(int n)
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
            return n * fac(n - 1);
        }

    }
}
