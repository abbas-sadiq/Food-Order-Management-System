package org.abbas.ordermgmt;




public class Waiter {
    private Counter counter;
    OrderQueue Waiter_orderQueue = new OrderQueue();

    public Waiter(Counter counter) {
        this.counter = counter;
    }

    public void takeOrder(Order order){
        System.out.printf("Waiter: Taking order:: tableNo: %S, pizza: %s, burger: %s, Fries: %s, cold drink: %s",
                order.getTableNo(), order.getPizza(),
                order.getBurger(), order.getFries(), order.getColdDrinks());
        Waiter_orderQueue.enQueue(order);

    }


    public void placeNewOrderToCounter(){

        if(Waiter_orderQueue.isEmpty()){
            System.out.println("No order in queue");
            return;
        }
        Order order = Waiter_orderQueue.deQueue();
        System.out.printf("Preparing order for table %s: Pizza: %s, Burger: %s, Fries: %s, Cold Drink: %s\n",
                order.getTableNo(), order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
        counter.submitToPrepare(order);
    }

    public void deliverOrderToTable() {
        Order order = counter.pickToDeliver();
        if (order == null) {
            System.out.println("No orders to deliver!");
            return;
        }
        System.out.printf("Order Delivered :: Pizza: %s, Burger: %s, Fries: %s, Cold Drink: %s%n",
                order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
    }


    public void checkOrderList() {
        System.out.println("\n" + "==={==============Waiter isChecking orders list==============  \n");
        Waiter_orderQueue.displayOrders();
    }
}

