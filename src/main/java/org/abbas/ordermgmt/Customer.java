package org.abbas.ordermgmt;

import java.util.List;

public class Customer {
    private Table table;

    public Customer(Table table) {
        this.table = table;
    }

    public void requestForTable(int capacity, Manager manager){
        System.out.println("Customer: we need table for: " + capacity + " Persons");
        int assignTableNo = manager.requestTable(capacity);
        if(assignTableNo == -1){
            System.out.println("Manager: Sorry! Please Wait a few Minutes. I've no available for Capacity:" + capacity);
        }else{
            this.table = new Table(assignTableNo, capacity);
            System.out.println("Manager: Sir please go on Table -> " + assignTableNo + "\nTable Assigned\n");
        }

    }

    public Order decideOrder(List<Item> orderItems){
        Order order = new Order();
        order.setOrderItemList(orderItems);
        order.displayOrder();
        return order;
    }
}
