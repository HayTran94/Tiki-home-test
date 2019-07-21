package tests;
import junit.framework.TestCase;
import main.Product;
import main.ShoppingCart;
import main.User;
import org.junit.Assert;
import org.junit.Test;

public class ModelTest extends TestCase {
    private Product appleProduct = new Product("Apple", 4.95);
    private Product orangeProduct = new Product("Orange", 3.99);

    @Test
    public void test1() {
        User user = new User("John Doe", "john.doe@example.com");
        ShoppingCart cart = user.createShoppingCart();
        cart.addProduct(appleProduct, 2);
        cart.addProduct(orangeProduct, 1);
        Assert.assertEquals(cart.calculateTotalPrice(), 13.89, 0);
    }

    @Test
    public void test2() throws Exception{
        User user = new User("John Doe", "john.doe@example.com");
        ShoppingCart cart = user.createShoppingCart();
        cart.addProduct(appleProduct, 3);
        cart.removeProduct(appleProduct, 1);
        Assert.assertEquals(cart.calculateTotalPrice(), 9.9, 0);
    }

}
