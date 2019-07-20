package main;

import java.util.HashMap;

public class ShoppingCart {
    private User user;
    private HashMap<String, CartItem> cartItems;

    public ShoppingCart(User user) {
        this.user = user;
        this.cartItems = new HashMap<>();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addProduct(Product product, int number) {
        CartItem foundCartItem = cartItems.get(product.getName());
        if (foundCartItem == null) {
            CartItem cartItem = new CartItem(product, number);
            cartItems.put(product.getName(), cartItem);
        } else {
            foundCartItem.increaseQty(number);
        }
    }

    public void removeProduct(Product product, int number) {
        CartItem foundCartItem = cartItems.get(product.getName());
        if (foundCartItem != null) {
            foundCartItem.decreaseQty(number);
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : cartItems.values()) {
            totalPrice += cartItem.calculatePrice();
        }
        return totalPrice;
    }

}
