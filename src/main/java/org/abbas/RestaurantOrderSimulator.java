package org.abbas;


import org.abbas.ordermgmt.Chef;
import org.abbas.ordermgmt.Counter;
import org.abbas.ordermgmt.Order;
import org.abbas.ordermgmt.Waiter;

public class RestaurantOrderSimulator {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Waiter waiter = new Waiter(counter);
        Waiter waiter2 = new Waiter(counter2);

        Chef chef = new Chef(counter);
        Chef chef2 = new Chef(counter2);
        takeOrder(waiter, new Order( 1,"Medium", "Zinger burger", "French fries", "Fizzup"));
        takeOrder(waiter2, new Order( 3,"Large", "Chicken  burger", "Salted fries", "Dew"));
        placeNewOrderToCounter(waiter);
        placeNewOrderToCounter(waiter2);
        picNewOrderToPrepare(chef);
        picNewOrderToPrepare(chef2);
        placePreparedOrderToCounter(chef);
        placePreparedOrderToCounter(chef2);
        deliverOrderToTable(waiter);
        deliverOrderToTable(waiter2);

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