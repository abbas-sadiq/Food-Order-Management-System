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
    public Table getVacantTable(int capacity){
        for(Table table: tableList){
            if(!table.isOccupied() && table.getCapacity() >= capacity){
                table.setOccupied(true);
                return table;
            }
        }
        return  null;
    }

     public Table findTable(int tableNo){
        for(Table table : tableList){
            if(table.getTableNo() == tableNo){
                return table;
            }
        }
        return null;

     }

    public void displayTables() {
        for (Table table : tableList) {
            System.out.println(table);
        }
    }
}
