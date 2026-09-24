//Ques: For a given set of string print largest string
//Time Complexity:O(X x N)   X->traversing through each character of string   N->for loop traversing through all str[]

class largeststring 
{
    public static void main(String args[])
    {
        String str[]={"apple","mango","banana"};
        String largest=str[0];
        for(int i=1;i<str.length;i++)
        {
            if(largest.compareTo(str[i])<0)
            {
                largest=str[i];
            }
        }
        System.out.println("The Largest String is: "+largest);
    }
}