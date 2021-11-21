public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("NOWQON"));
    }

    public static boolean palindrome(String word)
    {
        int word_length = word.length();
        int times = 0;
        boolean ret = true;

        if(word_length % 2 == 0)
        {
            times = word_length / 2;
        }
        else
        {
            times = (word_length - 1) / 2;
        }
        System.out.println(times);
        for (int i = 0, j = word_length-1; i < times; i++, j--)
        {
            if(word.charAt(i) != word.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
