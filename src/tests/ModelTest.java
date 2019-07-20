package tests;
import junit.framework.TestCase;
import main.Product;
import main.ShoppingCart;
import main.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModelTest extends TestCase {

    private Product appleProduct;
    private Product orangeProduct;
    @Before
    public void setUp() {
        appleProduct = new Product("Apple", 4.95);
        orangeProduct = new Product("Orange", 3.99);
    }

    @Test
    public void test1() {
        User user = new User("John Doe", "john.doe@example.com");
        ShoppingCart cart = user.createShopingCart();
        cart.addProduct(appleProduct, 2);
        cart.addProduct(orangeProduct, 1);
        Assert.assertEquals(cart.calculateTotalPrice(), 4.95 * 2 + 3.99, 0f);
    }

    @Test
    public void test2() {
        User user = new User("John Doe", "john.doe@example.com");
        ShoppingCart cart = user.createShopingCart();
        cart.addProduct(appleProduct, 3);
        cart.removeProduct(appleProduct, 1);
        Assert.assertEquals(cart.calculateTotalPrice(), 4.95 * 2, 0f);
    }

}
