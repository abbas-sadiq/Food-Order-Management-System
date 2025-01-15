package org.abbas.ordermgmt;




public class Waiter {

    OrderQueue Waiter_orderQueue = new OrderQueue();
    private Menu menu;


    public Waiter(Menu menu) {
        this.menu = menu;
    }

    public void takeOrder(Order order, int tableNo){
        order.setTableNo(tableNo);
        Waiter_orderQueue.enQueue(order);
    }


    public void placeNewOrderToCounter(Counter counter){

        if(Waiter_orderQueue.isEmpty()){
            System.out.println("No order in queue");
            return;
        }
        Order order = Waiter_orderQueue.deQueue();
        counter.submitToPrepare(order);
    }

    public void deliverOrderToTable(Counter counter) {
        Order order = counter.pickToDeliver();
        if (order == null) {
            System.out.println("No orders to deliver!");
            return;
        }
        System.out.println("Waiter: Order Delivered Successfully...");
    }


    public void checkOrderList() {
        System.out.println("\n" + "==={==============Waiter isChecking orders list==============  \n");
        Waiter_orderQueue.displayOrders();
    }

    public void displayMenu(){
        menu.showMenu();
    }
}

