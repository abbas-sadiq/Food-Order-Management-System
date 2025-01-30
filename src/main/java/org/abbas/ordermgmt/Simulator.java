package org.abbas.ordermgmt;
import java.util.List;

public class Simulator {

    public void simulateSingleOrder() {
        Customer customer = new Customer(null);
        Manager manager = new Manager();
        //Tables Added By Manager:
        manager.addTable(new Table(1, 2));
        manager.addTable(new Table(2, 4));
        manager.addTable(new Table(3, 6));
        manager.addTable(new Table(4, 8));

        customer.requestForTable(3,manager);





    }

}
