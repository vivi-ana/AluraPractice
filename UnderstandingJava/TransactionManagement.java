package UnderstandingJava;

import java.util.Scanner;

/**
 * A simple transaction management system for a bank account.
 */
public class TransactionManagement {
    // Constants for menu options
    private static final int CHECK_BALANCE = 1;
    private static final int WITHDRAW = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 9;

    /**
     * Main method to manage transactions.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Account information
        String clientName = "Tony";
        String accountType = "Checking account";
        double balance = 1599.99;
        int option = 0;
        Scanner keyboard = new Scanner(System.in);

        // Display initial account information
        displayAccountInformation(clientName, accountType, balance);

        // Menu options
        String menu = getMenu();

        // Loop to handle operations until the user chooses to exit
        while (option != 9) {
            System.out.println(menu);
            option = keyboard.nextInt();

            // Switch to handle different menu options
            switch (option) {
                case CHECK_BALANCE:
                    System.out.println("Your updated balance is: $" + balance);
                    break;
                case WITHDRAW:
                    System.out.println("What amount would you like to withdraw?");
                    double withdrawalAmount = keyboard.nextDouble();
                    processWithdrawal(withdrawalAmount, balance);
                    break;
                case DEPOSIT:
                    System.out.println("What is the amount you wish to deposit?");
                    double depositAmount = keyboard.nextDouble();
                    balance = deposit(balance, depositAmount);
                    System.out.println("Your updated balance is: $" + balance);
                    break;
                case EXIT:
                    System.out.println("Thank you for using our services.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    /**
     * Returns the menu options for the transaction management system.
     *
     * @return A formatted string containing the menu options
     */
    private static String getMenu() {
        return """
                *** Enter the number of the option you want to select ***
                1 - For checking your balance
                2 - For withdrawal
                3 - For deposit
                9 - Exit
                """;
    }

    /**
     * Displays the account information including client name, account type, and balance.
     *
     * @param clientName The name of the client
     * @param accountType The type of the account
     * @param balance The current account balance
     */
    private static void displayAccountInformation(String clientName, String accountType, double balance) {
        System.out.println("*********************");
        System.out.println("\nClient name: " + clientName);
        System.out.println("Your account type is: " + accountType);
        System.out.println("Your available balance is: $" + balance);
        System.out.println("\n*********************");
    }

    /**
     * Method to deposit funds into the account.
     *
     * @param balance The current account balance
     * @param depositAmount The amount to deposit
     * @return The updated account balance after deposit
     */
    private static double deposit(double balance, double depositAmount) {
        return balance + depositAmount;
    }

    /**
     * Method to withdraw funds from the account.
     *
     * @param withdrawalAmount The amount to withdraw
     * @param balance The current account balance
     * @return The updated account balance after withdrawal
     */
    private static double withdraw(double withdrawalAmount, double balance) {
        return balance - withdrawalAmount;
    }

    /**
     * Method to process a withdrawal request.
     *
     * @param withdrawalAmount The amount to withdraw
     * @param balance The current account balance
     */
    private static void processWithdrawal(double withdrawalAmount, double balance){
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance = withdraw(withdrawalAmount, balance);
            System.out.println("Your updated balance is: $" + balance);
        }
    }
}
