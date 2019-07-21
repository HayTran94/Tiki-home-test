package main;

/**
 * This class represent a product.
 * @author Hay Tran Van
 */
public class Product {
    private String name;
    private double price;

    /**
     * The constructor of the Product class.
     * @param name A string contain the product name.
     * @param price A double value of the product price.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Return the name of this product.
     * @return A string contain the product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set a name for this product.
     * @param name A string contain the product name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the price of this product.
     * @return A double value specify the product price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set a price for this product.
     * @param price A double value specify the product price.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
