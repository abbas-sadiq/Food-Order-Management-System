package org.abbas.ordermgmt;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int tableNo;
    private List<Item> orderItemList;

    public Order() {
        this.orderItemList = new ArrayList<>();
        this.tableNo= getTableNo();
    }

    public int getTableNo() {
        return tableNo;
    }
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }
    public List<Item> getOrderItemList() {
        return orderItemList;
    }
    public void  setOrderItemList(List<Item> orderItemList) {
        this.orderItemList = orderItemList;
    }


    public void addItem(Item item){
        orderItemList.add(item);
    }

    public void displayOrder(){
        System.out.println("\n========Customer: Decide Order List=========== \n");
        for(Item item : orderItemList){
            System.out.println(" - " + item);
        }
    }
}


