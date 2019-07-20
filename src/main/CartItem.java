package main;

/**
 * This class represent a cart item has a associated product.
 * @see Product
 * @author Hay Tran Van
 */
public class CartItem {
    private Product product;
    private int qty;

    /**
     * The constructor of the CartItem class.
     * @param product A product instance.
     * @param qty   A int value specify the quantity of the product.
     */
    public CartItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    /**
     * Return the product instance of this cart item.
     * @return A product instance.
     */
    public Product getProduct() {
        return product;
    }


    /**
     * Set a product instance for this cart item.
     * @param product A product instance.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Return the quantity of the product.
     * @return A int value specify the quantity of the product.
     */
    public int getQty() {
        return qty;
    }

    /**
     * Set a quantity value for the product.
     * @param qty A int value specify the quantity of the product.
     * @throws Exception A exception when the given quantity is a negative number.
     */
    public void setQty(int qty) throws Exception {
        if (qty < 0) {
            throw new Exception("The product's quantity can not be negative");
        }
        this.qty = qty;
    }

    /**
     * This method increase the quantity of the product.
     * @param number A int value specify the quantity of the product will be increased.
     */
    public void increaseQty(int number){
        qty += number;
    }

    /**
     * This method decrease the quantity of the product.
     * @param number A int value specify the quantity of the product will be decreased.
     * @throws Exception A exception when the given number is greater than the current quantity of the cart item.
     */
    public void decreaseQty(int number) throws Exception {
        if (qty < number) {
            throw new Exception("The given number of the product is greater than the current product's quantity");
        }
        qty -= number;
    }

    /**
     * Return the total price of this cart item.
     * @return A float value specify the total price of this cart item.
     */
    public float calculateTotalPrice() {
        return product.getPrice() * qty;
    }
}
