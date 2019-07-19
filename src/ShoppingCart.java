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

    public void addProduct(Product product) {
        CartItem foundCartItem = cartItems.get(product.getName());
        if (foundCartItem != null) {
            foundCartItem.increaseQty(1);
        }
    }

    public void removeProduct(Product product) {
        CartItem foundCartItem = cartItems.get(product.getName());
        if (foundCartItem != null) {
            foundCartItem.decreaseQty(1);
        }
    }

    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (CartItem cartItem : cartItems.values()) {
            totalPrice += cartItem.calculatePrice();
        }
        return totalPrice;
    }

}
