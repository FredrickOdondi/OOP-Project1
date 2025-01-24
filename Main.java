import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        //Welcome the User
        System.out.println("Welcome to Trust Banking System");
        //Getting user input
        System.out.println("1. Account Information");
        System.out.println("2 Exit");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        switch (selection){
            case 1:
                BankAccount.SavingsAccount savings = new BankAccount.SavingsAccount("SAV123", 1000, 5);
                savings.displayAccountDetails();
                savings.addInterest();
                savings.displayAccountDetails();
                savings.deposit(200);
                savings.withdraw(300);
                savings.displayAccountDetails();

                System.out.println();

                // Create a CheckingAccount object
                BankAccount.CheckingAccount checking = new BankAccount.CheckingAccount("CHK456", 500, 2.5);
                checking.displayAccountDetails();
                checking.deposit(100);
                checking.withdraw(50);
                checking.withdraw(600); // Should show insufficient funds
                checking.displayAccountDetails();
                break;
            case 2:
                System.out.println("Goodbye have a lovely day!");

        }








        //Displays Account Information

    }
}

