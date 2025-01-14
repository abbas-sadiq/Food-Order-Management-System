package org.abbas.ordermgmt;

public class Simulator {

    public void simulateSingleOrder(){

        Item Pizza = new Item("pizza", 2000);
        Item Burger = new Item("burger", 1000);
        Item Fries = new Item("fries", 500);
        Item drink = new Item("drink", 200);
        Menu menu = new Menu(Pizza, Burger, Fries, drink);
        Waiter waiter = new Waiter(menu);
        waiter.displayMenu();
        waiter.takeOrder();





    }

    public void simulate2Waiters(){

    }

    public void simulate2Chefs(){

    }
    public void simulate2Counters(){

    }
    public void simulate3Counters(){

    }
}
