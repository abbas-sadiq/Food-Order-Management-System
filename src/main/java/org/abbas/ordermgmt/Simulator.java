package org.abbas.ordermgmt;
import java.util.List;

public class Simulator {

    public void simulateSingleOrder() {
        Customer customer = new Customer(null);
        Manager manager = new Manager();
        Counter counter = new Counter();
        Chef chef = new Chef();
        Order order = new Order();
        Item pizza = new Item("Pizza",700);
        Item burger = new Item("Burger",350);
        Item fries = new Item("Fries",150);
        Item drink = new Item("Drink",180);
        Menu menu = new Menu(pizza,burger,fries,drink);
        Waiter waiter = new Waiter("Ali",menu);

        //Tables Added By Manager:
        manager.addTable(new Table(1, 2));
        manager.addTable(new Table(2, 4));
        manager.addTable(new Table(3, 6));
        manager.addTable(new Table(4, 8));

        customer.requestForTable(3,manager);
        waiter.displayMenu();
        customer.decideOrder(List.of(pizza,fries,drink));
        waiter.takeOrder(order,2);
        waiter.checkOrderList();
        waiter.placeNewOrderToCounter(counter);
        chef.pickNewOrderToPrepare(counter);
        chef.checkOrderList();
        chef.placePreparedOrderToCounter(counter);
        waiter.deliverOrderToTable(counter);








    }

}
