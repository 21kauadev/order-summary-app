package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    // associações
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    // não faz sentido haver um order nulo, por isso não usei sobrecarga de
    // construtores

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        this.orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        this.orderItems.remove(item);
    }
}