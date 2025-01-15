package org.abbas.ordermgmt;
import java.util.List;

public class Order {
    private String tableNo;
    private List<Item> itemList;

    public Order(List<Item> itemList) {
        this.itemList = itemList;
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void displayOrder(){
        System.out.println("Taken Order List :: \n" + getItemList());

    }
}


