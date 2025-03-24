// Define a class named BankApp
import java.util.Scanner;


public class BankApp {
    public static void main(String[] args) {
        boolean app = true;
        Scanner MenuSelect = new Scanner(System.in);
    
        // Declare the account object outside the loop so it's accessible everywhere
        BankAccount newacc = null;
    
        while (app) {
            System.out.println("Welcome to the boat banking app");
            System.out.println("Press 1 to Create Account");
            System.out.println("Press 2 to Deposit Money");
            System.out.println("Press 3 to Withdraw Money");
            System.out.println("Press 4 to View Account Details");
            System.out.println("Press 5 to Exit");
    
            String choice = MenuSelect.nextLine();
    
            // Menu options
            if (choice.equals("1")) {
                System.out.println("Please enter your name:");
                String AccName = MenuSelect.nextLine();
                int AccNum = (int) (Math.random() * 10001);
    
                // Creating the new account
                newacc = new BankAccount(AccNum, AccName, 100);
    
                // Show the account details after creation
                newacc.displayAccountInfo();
            }
    
            // Deposit money (if account exists)
            if (choice.equals("2")) {
                if (newacc != null) {  // Ensure the account exists first
                    System.out.println("How much money would you like to deposit?");
                    int depoNum = MenuSelect.nextInt();
                    MenuSelect.nextLine(); // Flush the buffer
    
                    newacc.deposit(depoNum);
                    newacc.displayAccountInfo();
                } else {
                    System.out.println("You need to create an account first!");
                }
            }


            if (choice.equals("3")){
                if (newacc != null) {
                    System.out.println("how much moneyon would you like to withdraw");
                    int depoNum = MenuSelect.nextInt();
                    MenuSelect.nextLine();

                    newacc.withdraw(depoNum);
                    newacc.displayAccountInfo();
                } else {
                    System.out.println("uncle Please drive");
                }
            if (choice.equals("4")){
                if (newacc != null) {
                    newacc.displayAccountInfo();

                }
                }

            }
    
            // Exit option
            if (choice.equals("5")) {
                app = false;
                System.out.println("Thank you for using Boat Banking!");
            }
        }
    
        MenuSelect.close(); // Close scanner 
    }
}