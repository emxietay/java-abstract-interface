package com.manhnam.abstractchallenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {

}
public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));
        storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
        storeProducts.add(new Furniture("Chair", 50, "Mahogany chair"));
        storeProducts.add(new Furniture("Lamp", 200, "Tiffany lamp with Hummingbirds"));

        listProducts();
        System.out.println("\nOrder1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        addItemToOrder(order1, 1, 3);
        printOrder(order1);
        System.out.println("\nOrder2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 4);
        addItemToOrder(order2, 3);
        addItemToOrder(order2, 1, 3);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var item : storeProducts
        ) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex) {
       addItemToOrder(order, orderIndex, 1);
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }


    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item: order
             ) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }
}
