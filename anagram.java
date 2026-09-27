import java.util.Arrays;
class anagram
{
    public static void main(String args[])
    {
        String str1="Race";
        String str2="care";
        if(str1.length()==str2.length())
        {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            char[] str1char =str1.toCharArray();
            char[] str2char =str2.toCharArray();
            Arrays.sort(str1char);
            Arrays.sort(str2char);
            if(Arrays.equals(str1char,str2char))
            {
                System.out.println("Two strings are Anagram");
            }
            else
            {
                System.out.println("Two strings are Not Anagram");
            }
        }
        else
        {
            System.out.println("Two strings are Not Anagram");
        }
    }
}