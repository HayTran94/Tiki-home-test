package main;

/**
 * This class represent a user has a associated shopping cart.
 * @see ShoppingCart
 * @author Hay Tran Van
 */
public class User {
    private String name;
    private String emailAddress;
    private ShoppingCart shoppingCart;

    /**
     * The constructor of the User class.
     * @param name A string contain the user name.
     * @param emailAddress A string contain the user email address.
     */
    public User(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    /**
     * Return the name of this user.
     * @return A string contain the user name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set a name for this user.
     * @param name A string contain the user name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the email address of this user.
     * @return A string contain the user email address.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Set a email address for this user.
     * @param emailAddress A string contain the user email address.
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Create a new shopping cart instance for this user.
     * @return A shopping cart instance.
     */
    public ShoppingCart createShoppingCart() {
        shoppingCart = new ShoppingCart(this);
        return shoppingCart;
    }

    /**
     * Return the current shopping cart instance of this user.
     * @return A shopping cart instance.
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
