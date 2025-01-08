package org.abbas.ordermgmt;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

class OrderQueue {
    private Queue<Order> orders;

    public OrderQueue() {
        this.orders = new LinkedBlockingQueue<Order>();

    }

    public void enQueue(Order order) {
        orders.add(order);
    }

    public Order deQueue() {
        if (orders.isEmpty()) {
            System.out.println("There is no Order in queue");
            return null;
        }
        return orders.poll();
    }

    public Order Peek() {
        if (orders.isEmpty()) {
            System.out.println("There is no Order in queue");
            return null;
        }
        return orders.peek();
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("There is no Order in queue");
        }
        int count = 1;
        for (Order order : orders) {
            System.out.println("Table No # " + count++ + "\n" +
                    "Pizza=" + order.getPizza() + "\n" +
                    "Burger='" + order.getBurger() + "\n" +

                    "Fries='" + order.getFries() + "\n" +
                    "coldDrinks='" + order.getColdDrinks() + "\n"
            );
        }
    }

}