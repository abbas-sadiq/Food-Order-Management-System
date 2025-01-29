package org.abbas.ordermgmt;

import java.util.List;

public class Customer {
    private Manager manager; // Reference to the restaurant manager

    // Constructor to initialize with a manager
    public Customer(Manager manager) {
        this.manager = manager;
    }

    // Method to request a table from the manager
    public int requestToManagerForTable(int capacity) {
        int assignedTableNo = manager.requestTable(capacity);
        if (assignedTableNo == -1) {
            System.out.println("No available table for capacity: " + capacity);
        } else {
            System.out.println("Table " + assignedTableNo + " assigned.");
        }
        return assignedTableNo;
    }

    // Method for customer to decide an order
    public Order decideOrder(List<Item> orderItems) {
        return new Order(orderItems); // Assuming Order has a constructor that takes a list of items
    }
}
