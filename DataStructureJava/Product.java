package DataStructureJava;

/**
 * Represents a product with a name and price.
 */
public class Product implements Comparable<Product> {
    private String name;
    private double price;

    /**
     * Constructs a Product with the specified name and price.
     * @param name The name of the product.
     * @param price The price of the product.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    /**
     * Overrides the toString method to provide a custom string representation of the product.
     * @return A string representation of the product.
     */
    @Override
    public String toString() {
        return "Product: " +
                "price = " + price +
                ", name = '" + name;
    }

    /**
     * Compares this product with another based on their prices.
     * @param anotherProduct The product to compare with.
     * @return The result of the price comparison.
     */
    @Override
    public int compareTo(Product anotherProduct) {
        return Double.compare(this.price, anotherProduct.getPrice());
    }
}
