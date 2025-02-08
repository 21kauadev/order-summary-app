package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    // associação
    private Product product;

    // não faz sentido haver um OrderItem sem quantidade, price ou uma instância
    // de produto (que aponta pra qual produto é) por
    // isso nao usei sobrecarga de construtores

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

    public Double subtotal() {
        return this.quantity * this.price;
    }
}
