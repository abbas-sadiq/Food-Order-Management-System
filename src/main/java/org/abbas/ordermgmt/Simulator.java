package org.abbas.ordermgmt;

import java.util.List;

public class Simulator {

    public void simulateSingleOrder(){

        Counter counter = new Counter();
        Chef chef = new Chef();

        Item pizza = new Item("pizza", 2000);
        Item burger = new Item("burger", 1000);
        Item fries = new Item("fries", 500);
        Item drink = new Item("drink", 200);
        Menu menu = new Menu(pizza, burger, fries, drink);
        Waiter waiter = new Waiter(menu);
        Customer customer = new Customer();
        waiter.displayMenu();
        Order burgerOrder = customer.decideOrder(List.of(burger, drink));
        Order pizzaOrder = customer.decideOrder(List.of(pizza, drink));
        Order friesOrder = customer.decideOrder(List.of(fries, drink));
        waiter.takeOrder(burgerOrder, 1);
        waiter.takeOrder(pizzaOrder, 2);
        waiter.takeOrder(friesOrder, 3);
        waiter.checkOrderList();
       waiter.placeNewOrderToCounter(counter);
       waiter.checkOrderList();
       waiter.placeNewOrderToCounter(counter);
       waiter.checkOrderList();
       waiter.placeNewOrderToCounter(counter);
       waiter.checkOrderList();
       chef.pickNewOrderToPrepare(counter);
       chef.checkOrderList();
       chef.pickNewOrderToPrepare(counter);
       chef.checkOrderList();
       chef.pickNewOrderToPrepare(counter);
       chef.checkOrderList();
       chef.placePreparedOrderToCounter(counter);
       waiter.deliverOrderToTable(counter);
       chef.placePreparedOrderToCounter(counter);
        waiter.deliverOrderToTable(counter);
       chef.placePreparedOrderToCounter(counter);
       waiter.deliverOrderToTable(counter);








    }

    public void simulate2Waiters(){
        Item pizza = new Item("pizza", 2000);
        Item burger = new Item("burger", 1000);
        Item fries = new Item("fries", 500);
        Item drink = new Item("drink", 200);
        Menu menu = new Menu(pizza, burger, fries, drink);
        Counter counter = new Counter();
        Chef chef =  new Chef();
        Waiter waiter1 = new Waiter(menu);
        Customer customer = new Customer();
        waiter1.displayMenu();
        Order order = customer.decideOrder(List.of(fries,burger,drink));
        waiter1.takeOrder(order,3);
        waiter1.placeNewOrderToCounter(counter);



    }

    public void simulate2Chefs(){
        Manager manager = new Manager();


        manager.displayTables();


    }
    public void simulate2Counters(){

    }
    public void simulate3Counters(){

    }
}
