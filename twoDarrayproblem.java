//Print the number of 7’s that are in the 2d array.
//Example :
//Input - int[][] array = { {4,7,8},{8,8,7} };
//Output - 2

//Time Complexity:O(N x M)  N->no. of row   M->no.of col
//Space Complexity: (O(1)

class twoDarrayproblem
{
    public static int two_D_array(int array[][],int key)
    {
        int count =0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
              {
                   if(array[i][j]==key)
                   {
                    count++;
                   }
              }
        }
        return count;
    }
    public static void main(String args[])
    {
        int[][] array = { {4,7,8},{8,8,7},{7,7,7} };
        int key=7;
        System.out.println("the Count of 7 : " +two_D_array(array,key));
    }
}