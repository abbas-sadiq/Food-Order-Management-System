package org.abbas.ordermgmt;

import java.util.List;

public class Customer {


    public Order decideOrder(List<Item> orderItems){
        Order order = new Order();
        order.setOrderItemList(orderItems);
        return order;
    }
}
