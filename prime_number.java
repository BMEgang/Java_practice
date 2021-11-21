public class prime_number {
    public static void main(String[] args) {
        System.out.println(prime(6));
    }
    public static boolean prime(int num)
    {
        boolean isprime=true;
        int len=num/2;
        for(int i=2;i<len;i++)
        {
            if(num%i==0)
            {
                isprime=false;
                break;
            }
        }
        return isprime;
    }
}
