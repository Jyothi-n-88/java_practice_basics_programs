import java.util.Scanner;
class bank
{
    private double balance;
    private int acc_no;
    private String acc_name;
    bank(int acc_no,String acc_name,double init_balance)
    {
         this.acc_no=acc_no;
         this.acc_name=acc_name;
         this.balance=init_balance;
    }
    public void checkbalance()
    {
        System.out.println("Acc-no:"+acc_no);
        System.out.println("Acc-name:"+acc_name);
        System.out.println("Balance:"+balance);
    }
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Balance after deposit:"+balance);
    }
    void withdraw(double amount)
    {
        if(amount<balance)
        {
            balance=balance-amount;
            System.out.println("Balance after withdrawal:"+balance);
        }
        else
        {
            System.out.println("Can not withdraw the amount due to insufficient balance");
        }
    }
}


public class banksystem
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         bank obj=new bank(101,"Janu",10000);
         obj.checkbalance();
         System.out.println("Enter the amount needs to be deposited");
         double dep_amount=sc.nextDouble();
         System.out.println("Enter the amount needs to be withdrawn");
         double with_amount=sc.nextDouble();
         obj.checkbalance();
         obj.deposit(dep_amount);
         obj.withdraw(with_amount);
    }
}