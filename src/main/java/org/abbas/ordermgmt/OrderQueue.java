package org.abbas.ordermgmt;


import java.util.List;
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
        /* Table:: 01 || Order:: burger:1000, drink:200 */
        StringBuilder stringBuilder = new StringBuilder();
        for (Order order : orders) {
            stringBuilder.append("Table:: ").append(order.getTableNo()).append(" || Order:: ");
            List<Item> items = order.getOrderItemList();
            for (int i = 0; i < items.size(); i++) {
                stringBuilder.append(items.get(i).toString());
                if (i < items.size()-1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }


}