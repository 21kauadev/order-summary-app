package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    // associação
    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public Product getProduct() {
        return this.product;
    }
}
