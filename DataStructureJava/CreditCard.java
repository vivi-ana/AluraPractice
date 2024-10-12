package DataStructureJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Credit Card with a limit, balance, and a list of purchased products.
 */
public class CreditCard {
    private double limit;
    private double balance;
    private List<Product> listOfProduct;

    /**
     * Constructs a CreditCard with the specified limit.
     * @param limit The credit limit for the card.
     */
    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.listOfProduct = new ArrayList<>();
    }

    /**
     * Checks if the CreditCard can afford to purchase a given product.
     * @param product The product to be purchased.
     * @return True if the card can afford the product, false otherwise.
     */
    private boolean canAfford (Product product){
        return product.getPrice() <= this.balance;
    }

    /**
     * Attempts to purchase a product with the CreditCard.
     * If successful, deducts the price from the balance and adds the product to the list.
     * @param product The product to be purchased.
     * @return True if the purchase is successful, false if the balance is insufficient.
     */
    public boolean canPurchase(Product product) {
        if (canAfford(product)){
            discountMoney(product);
            addPurchase(product);
            return true;
        }
        return false;
    }

    /**
     * Adds a purchased product to the list of products.
     * @param product The product to be added to the list.
     */
    private void addPurchase(Product product) {
        this.listOfProduct.add(product);
    }

    /**
     * Deducts the price of a purchased product from the card's balance.
     * @param product The product to be purchased.
     */
    private void discountMoney(Product product) {
        this.balance -= product.getPrice();
    }


    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Product> getListOfPurchase() {
        return listOfProduct;
    }
}
