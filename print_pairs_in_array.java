
public class array {
    public static void pairs(int array[])
    { int current;
        for(int i=0;i<array.length;i++)
        {
            current=array[i];
            for(int j=i+1;j<array.length;j++)
            {
                System.out.print("("+current+","+array[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[]={10,20,30,40};
        pairs(array);
    }
}