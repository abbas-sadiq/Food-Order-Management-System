package org.abbas.ordermgmt;

public class Chef {
    private Counter counter;
    OrderQueue orderQueue = new OrderQueue();

    public void gitOrderFromCounter(Order order){
        System.out.printf("Chef: preparing order for table : %s ", order.getTableNo());
        orderQueue.enQueue(counter.pickToPrepare());
    }
    public Order deliverOrderToCounter(){
        System.out.println("Chef: order is prepared.");
        return orderQueue.deQueue();
    }


}
