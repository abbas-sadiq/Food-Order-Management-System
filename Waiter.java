package Queue;




public class Waiter {
    OrderQueue orderQueue = new OrderQueue();
    Counter counter = new Counter();

    public void takeOrder(Order order){
        System.out.printf("Taking order:: tableNo: %S, pizza: %s, burger: %s, Fries: %s, cold drink: %s",
                order.getTableNo(), order.getPizza(),
                order.getBurger(), order.getFries(), order.getColdDrinks());
        orderQueue.enQueue(order);

    }


    public void prepareOrder(){

        if(orderQueue.isEmpty()){
            System.out.println("No order in queue");
            return;
        }
        Order order = orderQueue.Peek();
        System.out.printf("Preparing order for table %s: Pizza: %s, Burger: %s, Fries: %s, Cold Drink: %s\n",
                order.getTableNo(), order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
        counter.submitToPrepare(order);




    }

    public void deliverOrder() {
        Order order = counter.pickToDeliver();
        if (order == null) {
            System.out.println("No orders to deliver!");
            return;
        }
        System.out.printf("Order Delivered :: Pizza: %s, Burger: %s, Fries: %s, Cold Drink: %s%n",
                order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
    }


    public void checkOrderList(){
        System.out.println("\n"+"==={==============Checking orders list==============  \n");
        orderQueue.displayOrders();

        System.out.println("\n"+"==={==============Checking orders Waiting list==============  \n");
        counter.waitingOrderQueue.displayOrders();




        }
    }

