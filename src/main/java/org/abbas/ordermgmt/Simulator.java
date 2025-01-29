package org.abbas.ordermgmt;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public void simulateSingleOrder(){
        Manager manager = new Manager();
        Customer customer = new Customer(manager);
        Counter counter = new Counter();
        Order order = new Order();

        Item pizza = new Item("Pizza", 300);
        Item burger = new Item("Burger", 150);
        Item fries = new Item("Fries", 100);
        Item coldDrinks = new Item("Coke", 50);

        Menu menu = new Menu(pizza,burger,fries,coldDrinks);
        Chef chef = new Chef();
        Waiter waiter = new Waiter(menu);
        manager.addTable(new Table(1,2));
        manager.addTable(new Table(2,4));
        manager.addTable(new Table(3,6));
        manager.addTable(new Table(4,8));
        customer.requestToManagerForTable(4);
        manager.displayTables();
        manager.requestTable(4);
        manager.findVacantTable(2);
        waiter.displayMenu();
        customer.decideOrder(List.of(burger,coldDrinks,fries));
        waiter.takeOrder(order,2);
        waiter.checkOrderList();
        waiter.placeNewOrderToCounter(counter);
        waiter.checkOrderList();
        chef.pickNewOrderToPrepare(counter);
        chef.checkOrderList();
        chef.placePreparedOrderToCounter(counter);
        waiter.deliverOrderToTable(counter);




    }

    public void simulate2Waiters(){

    }
    public void simulate2Counters(){

    }
    public void simulate3Counters(){

    }
}
