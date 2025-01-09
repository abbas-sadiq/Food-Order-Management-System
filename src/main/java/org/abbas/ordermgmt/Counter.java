package org.abbas.ordermgmt;


public class Counter {
      OrderQueue OrderQueue = new OrderQueue();
      OrderQueue preparedOrderQueue = new OrderQueue();
      Chef chef = new Chef();

     public void submitToPrepare(Order order) {
          System.out.printf("Counter: Order submitted for preparation:: Table %s, Pizza: %s, Burger: %s, Fries: %s, " +
                          "Cold Drink: %s\n",
                  order.getTableNo(), order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
          OrderQueue.enQueue(order);
     }

     public Order pickToDeliver() {
          if(OrderQueue.isEmpty()){
               System.out.println("There is no Order");
          }
          System.out.println("Counter: order is ready to deliver");
          Order order = OrderQueue.deQueue();
          return order;

     }

     public Order pickToPrepare() {
          if(OrderQueue.isEmpty()){
               System.out.println("No order is available to prepare.");
          }
          System.out.println("Counter: order has been picked to prepare");
          Order order = OrderQueue.deQueue();
          return order;

     }



     public void placePreparedOrder(Order order) {
          System.out.println("Counter: order is prepared and ready to deliver");
          preparedOrderQueue.enQueue(order);


     }
}

