package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString, format);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(name, email, birthDate));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");

            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // associação

            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            // passando pra order um objeto do tipo orderItem, que contem um objeto do tipo
            // product.
            order.addItem(orderItem);
            // legal, né?
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);

        sc.close();
    }
}
