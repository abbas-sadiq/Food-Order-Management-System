package org.abbas;


import org.abbas.ordermgmt.Chef;
import org.abbas.ordermgmt.Counter;
import org.abbas.ordermgmt.Order;
import org.abbas.ordermgmt.Waiter;

public class RestaurantOrderSimulator {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Waiter waiter = new Waiter(counter);

        Chef chef = new Chef(counter);
        takeOrder(waiter, new Order( 1,"Medium", "Zinger burger", "French fries", "Fizzup"));
//        takeOrder(waiter,new Order(2,"Small", "no", "no", "no"));
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