package org.abbas.ordermgmt;


public class Counter {
      OrderQueue preparedOrderQueue = new OrderQueue();

     public void submitToPrepare(Order order) {
          System.out.printf("Counter: Order submitted for preparation:: Table %s, Pizza: %s, Burger: %s, Fries: %s, " +
                          "Cold Drink: %s\n",
                  order.getTableNo(), order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
          preparedOrderQueue.enQueue(order);
     }

     public Order pickToDeliver() {
          if(preparedOrderQueue.isEmpty()){
               System.out.println("There is no Order");
          }
          System.out.println("Counter: order is ready to deliver");
          Order order = preparedOrderQueue.deQueue();
          return order;

     }

     public Order pickToPrepare() {
          if(preparedOrderQueue.isEmpty()){
               System.out.println("There is no Order");
          }
          System.out.println("Counter: order has been picked to prepare");
          return preparedOrderQueue.deQueue();


     }
}

