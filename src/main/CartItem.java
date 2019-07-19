package main;

public class CartItem {
    private Product product;
    private int qty;

    public CartItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void increaseQty(int number){
        this.qty += number;
    }

    public void decreaseQty(int number) {
        this.qty -= number;
    }

    public double calculatePrice() {
        return product.getPrice() * qty;
    }
}
