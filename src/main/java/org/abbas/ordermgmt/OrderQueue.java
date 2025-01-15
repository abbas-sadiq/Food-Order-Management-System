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

    public boolean isEmpty() {
        return orders.isEmpty();
    }

    public void displayOrders() {
        /*Table:: 01 || Order:: burger:1000, drink:200*/
        StringBuilder stringBuilder = new StringBuilder();
        for (Order order : orders) {
            stringBuilder.append("Table:: ").append(order.getTableNo()).append(" || Order :: ");
            for (Item item : order.getOrderItemList()) {
                stringBuilder.append(item.toString()).append(", ");
            }
        }
        System.out.println(stringBuilder);
    }

}