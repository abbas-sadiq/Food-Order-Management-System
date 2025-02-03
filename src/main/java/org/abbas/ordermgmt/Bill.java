package org.abbas.ordermgmt;

import java.util.List;

public class Bill {
    private int tableNo;
    private List<Item> orderItems;
    private double totalAmount;

    public Bill(Order order) {
        this.tableNo = order.getTableNo();
        this.orderItems = order.getOrderItemList();
        this.totalAmount =  calculateTotal(order);
    }

    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getOrderItemList()) {
            total += item.getPrice();
        }
        return total;
    }

    public void printBill() {
        System.out.println("\n=====  Bill for Table: " + tableNo + " =====");
        for (Item item : orderItems) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("==================================\n");
    }
}
