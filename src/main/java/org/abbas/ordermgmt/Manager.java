package org.abbas.ordermgmt;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Table> tableList;

    public Manager() {
        this.tableList = new ArrayList<>();
    }

    public void addTable(Table table) {
        tableList.add(table);
    }
    public int requestTable(int capacity){
        for(Table table: tableList){
            if(!table.isOccupied() && table.getCapacity() >= capacity){
                table.setOccupied(true);
                return table.getTableNo();
            }
        }
        return -1;
    }

     public Table findTable(int tableNo){
        for(Table table : tableList){
            if(table.getTableNo() == tableNo){
                return table;
            }
        }
        return null;

     }



    public void findVacantTable(int tableNo) {
        Table table = findTable(tableNo);
        if (table != null) {
            if (table.isOccupied()) {
                table.freeTable();
            } else {
                System.out.println("Table: " + tableNo + " is already free");
            }
        } else {
            System.out.println("Table: " + tableNo + " not found. Please wait...");
        }
    }

    public void displayTables() {
        for (Table table : tableList) {
            System.out.println(table);
        }
    }
}
