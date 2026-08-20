import java.util.*;
import java.io.*;

class InvalidPinException extends Exception {

    InvalidPinException(String message) {
        super(message);
    }
}

class bank {

    private double balance;
    private int acc_no;
    private String acc_name;
    private int pin;

    bank(int acc_no, String acc_name, double init_balance, int pin) {
        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.balance = init_balance;
        this.pin = pin;
    }

    // Authentication
    void checkPin(int userpin) throws InvalidPinException {
        if (userpin != pin) {
            throw new InvalidPinException("Invalid PIN");
        }
        System.out.println("PIN verified successfully!");
    }

    public void checkbalance() {
        System.out.println("Acc-no: " + acc_no);
        System.out.println("Acc-name: " + acc_name);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Balance after deposit: " + balance);

        writeToFile("Deposit", amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(
                "Balance after withdrawal: " + balance
            );

            writeToFile("Withdrawal", amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    // File writing method
    void writeToFile(String transaction, double amount) {

        try {

            FileWriter fw = new FileWriter("bankdetails.txt", true);

            fw.write("Account Number: " + acc_no + "\n");
            fw.write("Account Name: " + acc_name + "\n");
            fw.write("Transaction: " + transaction + "\n");
            fw.write("Amount: " + amount + "\n");
            fw.write("Current Balance: " + balance + "\n");
            fw.write("--------------------------------\n");

            fw.close();

            System.out.println("Transaction details saved to file.");

        }
        catch (IOException e) {

            System.out.println("Error while writing to file.");
        }
    }
}

public class banksystem {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        bank obj = new bank(
            101,
            "Janu",
            10000,
            123456
        );

        System.out.println("Enter your PIN:");

        int userpin = sc.nextInt();

        // Authentication
        try {

            obj.checkPin(userpin);

        }
        catch (InvalidPinException e) {

            System.out.println(e.getMessage());
            System.out.println("Access denied.");

            return;
        }

        while (true) {

            System.out.println("\n1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter amount to deposit:");

                    double depositAmount =
                        sc.nextDouble();

                    obj.deposit(depositAmount);

                    break;

                case 2:

                    System.out.println("Enter amount to withdraw:");

                    double withdrawAmount =
                        sc.nextDouble();

                    obj.withdraw(withdrawAmount);

                    break;

                case 3:

                    obj.checkbalance();

                    break;

                case 4:

                    System.out.println(
                        "Thank you! You are exiting."
                    );

                    sc.close();

                    return;

                default:

                    System.out.println(
                        "Invalid choice"
                    );
            }
        }
    }
}