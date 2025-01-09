package org.abbas.ordermgmt;

public class Chef {
    private Counter counter;
    OrderQueue orderQueue = new OrderQueue();



    public void pickNewOrderToPrepare(){
        if(orderQueue.isEmpty()){
            System.out.println("Chef: Order is not available to prepare");
            return;
        }
        Order order = counter.pickToPrepare();
        System.out.printf("Chef: preparing order for table : %s ", order.getTableNo());
        orderQueue.enQueue(order);


    }
    public void placePreparedOrderToCounter(){
        if(orderQueue.isEmpty()){
            System.out.println("Chef: Order is not available to place to counter");
            return;
        }
        System.out.println("Chef: order is prepared.");
        counter.placePreparedOrder(orderQueue.deQueue());
    }

    public void checkOrderList() {
        System.out.println("\n" + "=================Chef is Checking orders list==============  \n");
        orderQueue.displayOrders();
    }




}
