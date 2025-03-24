public class BankAccount {

    private int accountNumber;
    private String holderName;
    private double accountBalance;

    //  Constructor — Initializes account details
    public BankAccount(int accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountBalance = initialBalance;
    }

    //  Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    //  Method to withdraw money (checks for insufficient balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    //  Method to display account info
    public void displayAccountInfo() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: $" + accountBalance);
    }

    //   Method to transfer money between accounts
    public void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= accountBalance) {
            this.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transferred $" + amount + " to " + receiver.holderName);
        } else {
            System.out.println("Transfer failed — check amount and balance.");
        }
    }

    //  Getters  Allow access to private details from other classes
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
