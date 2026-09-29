import java.util.ArrayList;
import java.util.List;
public class spiral_matrix
{
    public static List<Integer> spiralmatrix(int [][]matrix)
    {
        List<Integer> result =new ArrayList<>();
        int firstRow=0;
        int firstCol=0;
        int lastRow=matrix.length-1;
        int lastCol=matrix[0].length-1;
        while(firstRow<=lastRow && firstCol<=lastCol)
        {
            //Top
            for(int i=firstCol;i<=lastCol;i++)
            {
                result.add(matrix[firstRow][i]);
            }
            firstRow++;

            //Right
            for(int i=firstRow;i<=lastRow;i++)
            {
                result.add(matrix[i][lastCol]);
            }
            lastCol--;
            
            //Bottom
            if (firstRow <= lastRow) {
                for (int i = lastCol; i >= firstCol; i--) {
                    result.add(matrix[lastRow][i]);
                }
                lastRow--;
            }

            //Left
            if (firstCol <= lastCol) {
                for (int i= lastRow; i >= firstRow; i--) {
                    result.add(matrix[i][firstCol]);
                }
                firstCol++;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int [][]matrix={
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 }
        };
        List spiral=spiralmatrix(matrix);
        System.out.println(spiral);
    }
}