package main;

import java.util.HashMap;

/**
 * This class represent a shopping cart has a associated user and many cart item.
 * @see User
 * @see CartItem
 * @author Hay Tran Van
 */
public class ShoppingCart {
    private User user;
    private HashMap<String, CartItem> cartItems;

    /**
     * The constructor of the ShoppingCart class.
     * @param user A user instance.
     */
    public ShoppingCart(User user) {
        this.user = user;
        this.cartItems = new HashMap<>();
    }

    /**
     * Return the user instance of this shopping cart.
     * @return A user instance.
     */
    public User getUser() {
        return user;
    }

    /**
     * Set a user instance for this shopping cart.
     * @param user A user instance.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * This method add a product to this shopping cart along with its quantity.
     * @param product A product instance.
     * @param number A int value specify the number of the product.
     */
    public void addProduct(Product product, int number) {
        CartItem cartItem = cartItems.get(product.getName());
        if (cartItem == null) {
            CartItem newCartItem = new CartItem(product, number);
            cartItems.put(product.getName(), newCartItem);
        } else {
            cartItem.increaseQty(number);
        }
    }

    /**
     * This method remove a product from this shopping cart along with its quantity.
     * @param product A product instance.
     * @param number A int value specify the number of the product.
     * @throws Exception A exception when the given product is not exist in the shopping cart.
     */
    public void removeProduct(Product product, int number) throws Exception {
        CartItem cartItem = cartItems.get(product.getName());
        if (cartItem == null) {
            throw new Exception("The given product is not exist in the shopping cart");
        } else {
             if (cartItem.getQty() == number) {
                cartItems.remove(product.getName());
            } else {
                cartItem.decreaseQty(number);
            }
        }
    }

    /**
     * Calculate total price for this shopping cart.
     * @return A double value specify the total price for the shopping cart.
     */
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : cartItems.values()) {
            totalPrice += cartItem.calculateTotalPrice();
        }
        return totalPrice;
    }

}
