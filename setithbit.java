class bit_manipulation
{
    public static int setithbit(int num,int i)
    {
        int bitmask=1<<i;
        return num | bitmask;
    }
    public static void main(String args[])
    {
        System.out.println(setithbit(7,2));
    }
}