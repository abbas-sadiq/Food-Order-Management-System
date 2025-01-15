package org.abbas.ordermgmt;


public class Counter {
     OrderQueue Counter_OrderQueue = new OrderQueue();
     OrderQueue Counter_preparedOrderQueue = new OrderQueue();



     public void submitToPrepare(Order order) {
          Counter_OrderQueue.enQueue(order);
     }

     public Order pickToDeliver() {
          if(Counter_preparedOrderQueue.isEmpty()){
               System.out.println("There is no Order");
               return null;
          }
          System.out.println("Counter: order is ready to deliver");
          Order order = Counter_preparedOrderQueue.deQueue();
          return order;

     }

     public Order  pickToPrepare() {
          if(Counter_OrderQueue.isEmpty()){
               System.out.println("No order is available to prepare.");
               return null;
          }
          System.out.println("Counter: order has been picked to prepare");
          Order order = Counter_OrderQueue.deQueue();
          return order;

     }



     public void placePreparedOrder(Order order) {
          System.out.println("Counter: order is prepared and ready to deliver");
          Counter_preparedOrderQueue.enQueue(order);


     }
}

