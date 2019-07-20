package tests;
import junit.framework.TestCase;
import main.Product;
import main.ShoppingCart;
import main.User;
import org.junit.Assert;
import org.junit.Test;

public class ModelTest extends TestCase {
    float applePrice = 4.95f;
    float orangePrice = 3.99f;
    private Product appleProduct = new Product("Apple", applePrice);
    private Product orangeProduct = new Product("Orange", orangePrice);

    @Test
    public void test1() throws Exception {
        User user = new User("John Doe", "john.doe@example.com");
        ShoppingCart cart = user.createShoppingCart();
        cart.addProduct(appleProduct, 2);
        cart.addProduct(orangeProduct, 1);
        Assert.assertEquals(cart.calculateTotalPrice(), applePrice * 2 + orangePrice, 0);
    }

    @Test
    public void test2() throws Exception{
        User user = new User("John Doe", "john.doe@example.com");
        ShoppingCart cart = user.createShoppingCart();
        cart.addProduct(appleProduct, 3);
        cart.removeProduct(appleProduct, 1);
        Assert.assertEquals(cart.calculateTotalPrice(), applePrice * 2, 0);
    }

}
