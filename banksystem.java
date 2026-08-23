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

        fw.write("\n===== Transaction =====\n");
        fw.write("Account Number : " + acc_no + "\n");
        fw.write("Account Name   : " + acc_name + "\n");
        fw.write("Transaction    : " + transaction + "\n");
        fw.write("Amount         : " + amount + "\n");
        fw.write("Current Balance: " + balance + "\n");
        fw.write("========================\n");

        fw.close();

        System.out.println("Transaction details saved to file.");

    } 
    catch (IOException e) {
        System.out.println("Error while writing to file.");
    }
}

void readFromFile() {

    try {

        FileReader fr = new FileReader("bankdetails.txt");
        Scanner file = new Scanner(fr);

        while (file.hasNextLine()) {
            System.out.println(file.nextLine());
        }

        file.close();
        fr.close();

    }
    catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }
    catch (IOException e) {
        System.out.println("Error while reading the file.");
    }
}
    


}

public class banksystem {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Multiple accounts
        bank[] accounts = new bank[3];

        accounts[0] = new bank(101, "Janu", 10000, 123456);
        accounts[1] = new bank(102, "Jyothi", 50000, 78910);
        accounts[2] = new bank(103, "Manju", 25000, 11111);

        System.out.println("Enter your PIN:");
        int userpin = sc.nextInt();

        bank currentUser = null;

        // Find account with matching PIN
        for (int i = 0; i < accounts.length; i++) {
            try {
                accounts[i].checkPin(userpin);
                currentUser = accounts[i];
                break;
            } catch (InvalidPinException e) {
                // Ignore and check next account
            }
        }

        // If PIN doesn't match any account
        if (currentUser == null) {
            System.out.println("Invalid PIN");
            System.out.println("Access denied.");
            sc.close();
            return;
        }

        System.out.println("Login Successful!");

        while (true) {

            System.out.println("\n1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Read Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    currentUser.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    currentUser.withdraw(withdrawAmount);
                    break;

                case 3:
                    currentUser.checkbalance();
                    break;

                case 4:
                    currentUser.readFromFile();
                    break;

                case 5:
                   System.out.println("Thank you! You are exiting.");
                   sc.close();
                   return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}