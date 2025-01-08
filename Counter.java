package Queue;

public class Counter {
      OrderQueue waitingOrderQueue = new OrderQueue();
      OrderQueue preparedOrderQueue = new OrderQueue();

     public void submitToPrepare(Order order) {
          if(waitingOrderQueue.isEmpty()){
               return;
          }

          System.out.printf("Order submitted for preparation:: Table %s, Pizza: %s, Burger: %s, Fries: %s, Cold Drink: %s\n",
                  order.getTableNo(), order.getPizza(), order.getBurger(), order.getFries(), order.getColdDrinks());
          preparedOrderQueue.enQueue(order);
          System.out.println("order prepared");
     }

     public Order pickToDeliver() {
          if(preparedOrderQueue.isEmpty()){
               System.out.println("There is no Order");
          }
          Order order = preparedOrderQueue.deQueue();
          return order;

     }
}

