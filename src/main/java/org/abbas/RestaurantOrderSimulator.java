package org.abbas;


import org.abbas.ordermgmt.Chef;
import org.abbas.ordermgmt.Order;
import org.abbas.ordermgmt.Waiter;

public class RestaurantOrderSimulator {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        takeOrder(waiter, new Order( 1,"Medium", "Zinger burger", "French fries", "Fizzup"));
        placeNewOrderToCounter(waiter);
        picNewOrderToPrepare(chef);
        placePreparedOrderToCounter(chef);
        deliverOrderToTable(waiter);

    }

    private static void placePreparedOrderToCounter(Chef chef) {
        chef.placePreparedOrderToCounter();
        chef.checkOrderList();
    }

    private static void picNewOrderToPrepare(Chef chef) {
        chef.pickNewOrderToPrepare();
        chef.checkOrderList();
    }

    private static void takeOrder(Waiter waiter, Order order) {
        waiter.takeOrder(order);
        waiter.checkOrderList();
    }

    private static void placeNewOrderToCounter(Waiter waiter) {
        waiter.placeNewOrderToCounter();
        waiter.checkOrderList();
    }

    private static void deliverOrderToTable(Waiter waiter) {
        waiter.deliverOrderToTable();
        waiter.checkOrderList();
    }
}