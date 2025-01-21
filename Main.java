import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        System.out.println("Welcome to Equity Bank");
        //display services
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Show my balance");
        //Create a scanner tool to read input
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        //display Deposit
        if (selection == 1) {
            //Deposit Money
            System.out.println("Enter amount to deposit");

            double amount_withdrawn = scanner.nextDouble();
            account.withdraw(amount_withdrawn);
        } else if (selection == 2) {
            //Withdraw Money
            System.out.println("Enter amount to withdraw");
            double amount_to_deposit = scanner.nextDouble();
            account.deposit(amount_to_deposit);
            // Show balance
        } else if (selection == 3) {
            System.out.println("Transaction was successfully completed." +
                    " Current Balance: " + account.checkBalance());
        } else {
            System.out.println("Invalid Choice");
        }
    }
}

