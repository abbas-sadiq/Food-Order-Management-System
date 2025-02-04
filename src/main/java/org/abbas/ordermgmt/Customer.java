package org.abbas.ordermgmt;

import java.util.List;

public class Customer {
    private Table table;

    public Customer(Table table) {
        this.table = table;
    }

    public Table requestForTable(int capacity, Manager manager){
        System.out.println("Customer: we need table for: " + capacity + " Persons");
        Table assignTableNo = manager.getVacantTable(capacity);
        if(assignTableNo == null){
            System.out.println("Manager: Sorry! Please Wait a few Minutes. I've no available for Capacity:" + capacity);
        }else{

            System.out.println("Manager: Sir please go on Table -> " + assignTableNo + "\nTable Assigned\n");
        }
        return manager.getVacantTable(capacity);

    }

    public Order decideOrder(List<Item> orderItemList){
        Order order = new Order();
        order.setOrderItemList(orderItemList);
        order.displayOrder();

        return order;
    }

}
