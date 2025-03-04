package org.abbas.ordermgmt;

public class Chef {

    OrderQueue Chef_orderQueue = new OrderQueue();

    public void pickNewOrderToPrepare(Counter counter){
        Order order = counter.pickToPrepare();
        if(order == null){
            System.out.println("Chef: no new order is available to prepare");
            return;
        }
        System.out.printf("Chef: preparing order for table : %s ", order.getTableNo());
        Chef_orderQueue.enQueue(order);



    }
    public void placePreparedOrderToCounter(Counter counter){
        if(Chef_orderQueue.isEmpty()){
            System.out.println("Chef: Order is not available to place to counter");
            return;
        }
        System.out.println("Chef: order is prepared.");
        counter.placePreparedOrder(Chef_orderQueue.deQueue());
    }

    public void checkOrderList() {
        System.out.println("\n" + "=================Chef is Checking orders list==============  \n");
        Chef_orderQueue.displayOrders();
    }




}
