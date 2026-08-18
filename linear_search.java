import java.util.Scanner;
public class Functions
{

    public static int menu_list(String menu[],String key)//function definition
    {
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
       String menu[]={"Samosa","Juice","Milkshake","Ice cream"};
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter key to be searched in menu:");
       String key=sc.next();
       int index=menu_list(menu,key);
       System.out.print("The key is found at "+index +" index");
    }
}