package entities;

public class Product {
    private String name;
    private Double price;

    // não faz sentido haver um product nulo, por isso usei sobrecarga de
    // construtores permitindo que apenas o preço seja opcional.

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }
}
