public class binary_number_coverter {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1111"));
    }
    public static int binaryToDecimal(String num)
    {
        int ret = 0;

        for(int i = 0, j = num.length() - 1; i < num.length();i++, j--)
        {
            ret += Integer.valueOf((((int)num.charAt(j))-48)) * Math.pow(2,i);
        }

        return ret;
    }

}
