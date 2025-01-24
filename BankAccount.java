public class BankAccount {
    private String accountNumber = "12FS56"; // variable to hold account number

    private static double balance; //variable to hold account balance

    //Constructor to initialize balance and account number
    public BankAccount(double balance) {
        this.accountNumber = accountNumber;
        BankAccount.balance = balance;
    }

    //Method to deposit money accepts amount as parameter
    public void deposit(double amount) {
        if (balance > 0) {
            balance += amount;
        } else {
            System.out.println("Must be a number");
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
    //method to display account number
    private String getAccountNumber(){
        return accountNumber;
    }
    //method to display Account Details
    public void displayAccountDetails(){
        System.out.println("Account Number: "+ getAccountNumber());
        System.out.println("Balance: "+ checkBalance());
    }
    // Child class: SavingsAccount
    static class SavingsAccount extends BankAccount {

        // Constructor
        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(balance);
        }
    }
    // Method to calculate and add interest
    public void addInterest() {
        double interestRate = 12;
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
    //Child class checking Account
    static class CheckingAccount extends BankAccount{
        private double transactionFee;
        //Constructor
        public CheckingAccount(String accountNumber, double balance, double v) {
            super(balance);
        }
        public void withdraw(double amount){
            if (amount+transactionFee<=balance){
                balance-=(amount+transactionFee);
                System.out.println("Withdrawn: " + amount + " (Fee: " + transactionFee + ")");
            }
        }
    }
}


