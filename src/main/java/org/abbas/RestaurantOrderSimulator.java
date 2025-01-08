package org.abbas;


import org.abbas.ordermgmt.Order;
import org.abbas.ordermgmt.Waiter;

public class RestaurantOrderSimulator {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        takeOrder(waiter, new Order( 1,"Medium", "Zinger burger", "French fries", "Fizzup"));
        takeOrder(waiter, new Order( 2,"Large", "Shami burger", "French fries", "nextCola"));
        prepareOrder(waiter);
        deliverOrder(waiter);
        prepareOrder(waiter);
        deliverOrder(waiter);
    }

    private static void takeOrder(Waiter waiter, Order order) {
        waiter.takeOrder(order);
        waiter.checkOrderList();
    }

    private static void prepareOrder(Waiter waiter) {
        waiter.prepareOrder();
        waiter.checkOrderList();
    }

    private static void deliverOrder(Waiter waiter) {
        waiter.deliverOrder();
        waiter.checkOrderList();
    }
}