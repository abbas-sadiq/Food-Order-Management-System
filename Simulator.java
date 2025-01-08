package Queue;




public class Simulator {
    public static void main(String [] args){
        Waiter waiter = new Waiter();
        Counter counter = new Counter();

        counter.submitToPrepare(new Order(1, "Small","Chicken", "no","Finta"));
        counter.submitToPrepare(new Order(1, "Small","Chicken", "no","Finta"));
        counter.submitToPrepare(new Order(1, "Small","Chicken", "no","Finta"));
        takeOrder(waiter, new Order( 1,"Medium", "Zinger burger", "French fries", "Fizzup"));
        takeOrder(waiter, new Order(2, "Small", "Shami Burger", "no", "Sprite"));
        takeOrder(waiter, new Order(3, "Large", "Chicken burger", "Salted fries", "Gourmet cola"));

        deliverOrder(waiter);
        takeOrder(waiter, new Order(4, "Medium", "Zinger burger", "French fries", "Gourmet cola"));
        deliverOrder(waiter);
        deliverOrder(waiter);
        deliverOrder(waiter);
        deliverOrder(waiter);

        counter.submitToPrepare(new Order(1, "Small","Chicken", "no","7up"));
        counter.submitToPrepare(new Order(1, "Small","Chicken", "Salted","Dew"));
        counter.submitToPrepare(new Order(1, "Small","Chicken", "French","Big Apple"));
        counter.pickToDeliver();




        // waiter will take order from table 1;
        // check order list
        // waiter will deliver order to table 1;
        // check order list
        // waiter will take order from table 2;
        // check order list
        // waiter will take order from table 3;
        // check order list
        // waiter will deliver order to table 2;
        // check order list
        // waiter will deliver order to table 3;
        // check order list
        // waiter will take order from table 4;
        // check order list
        // waiter will deliver order to table 4;
        // check order list
        // waiter will deliver order;
        // check order list
        // waiter will deliver order;
        // check order list
    }

    private static void takeOrder(Waiter waiter, Order order) {
        waiter.takeOrder(order);
        waiter.checkOrderList();
    }

    private static void deliverOrder(Waiter waiter) {
        waiter.deliverOrder();
        waiter.checkOrderList();
    }
}