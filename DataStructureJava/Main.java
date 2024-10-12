package DataStructureJava;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double limit = getCreditCardLimit(keyboard);

        CreditCard creditCard = new CreditCard(limit);
        processPurchases(keyboard, creditCard);

        displayPurchaseSummary(creditCard);
    }

    /**
     * Gets the credit card limit from the user via input.
     * @param keyboard The Scanner object for user input.
     * @return The credit card limit entered by the user.
     */
    private static double getCreditCardLimit(Scanner keyboard) {
        System.out.println("Please, enter the limit for your credit card");
        return keyboard.nextDouble();
    }

    /**
     * Processes the purchases made by the user with the credit card.
     * @param keyboard The Scanner object for user input.
     * @param creditCard The CreditCard object for purchases.
     */
    private static void processPurchases(Scanner keyboard, CreditCard creditCard) {
        int exit = 1;
        while (exit != 0) {
            Product product = createProduct(keyboard);

            // If the user can afford the product, process the purchase, otherwise exit
            if(creditCard.canPurchase(product)){
                System.out.println("Purchase completed");
                System.out.println("Please, enter 1 to continue shopping or 0 to exit");
                exit = keyboard.nextInt();
            } else {
                System.out.println("Insufficient balance");
                exit = 0;
            }
        }
    }

    /**
     * Creates a new product based on user input.
     * @param keyboard The Scanner object for user input.
     * @return The newly created product.
     */
    private static Product createProduct(Scanner keyboard) {
        System.out.println("Please, enter the name of your product");
        String name = keyboard.next();
        System.out.println("Please, enter the the price");
        double price = keyboard.nextDouble();

        return new Product(name, price);
    }

    /**
     * Displays a summary of the purchases made with the credit card.
     * @param creditCard The CreditCard object containing the purchased products.
     */
    private static void displayPurchaseSummary(CreditCard creditCard) {
        System.out.println("******************************");
        System.out.println("Your purchase summary is: \n");
        Collections.sort(creditCard.getListOfPurchase());
        for (Product product : creditCard.getListOfPurchase()){
            System.out.println(product.getName() + " - " + product.getPrice());
        }
        System.out.println("******************************");
        System.out.println("\n Your balance is " + creditCard.getBalance());
    }
}
