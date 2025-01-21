public class BankAccount {

    private double balance; //variable to hold account balance

    //Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Method to deposit money accepts amount as parameter
    public void deposit(double amount) {
        if (balance > 0) {
            balance += amount;
        } else {
            System.out.println("Must be an integer");
        }
    }

    //Method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        if (amount > balance) {
            System.out.println("Insufficient funds in your account");
        }
    }

    //method to check balance
    public double checkBalance() {
        return balance;
    }
}
