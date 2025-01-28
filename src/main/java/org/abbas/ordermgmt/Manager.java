package org.abbas.ordermgmt;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Table>tableList;

    public Manager() {
        this.tableList = new ArrayList<>();
    }

    public void addTable(Table table){
        this.tableList.add(table);

    }

    public Table findTable(int tableNo){
        for (Table table : tableList) {
            if(table.getTableNo() == tableNo){
                return table;
            }
        }

        return null;
    }
    public int requestTable(int capacity){

    }

    public boolean findVacantTable(int tableNo){
        Table table = findTable(tableNo);
        if(table != null){
            if(table.isOccupied()){
                table.freeTable();
                return true;
            }else{
                System.out.println("Table: " + tableNo + " is Already free");
                return false;
            }
        }else{
            System.out.println("Table:" + tableNo + "not found \n Please Wait....");
            return false;
        }

    }
    public void displayTables() {
        for (Table table : tableList) {
            System.out.println(table);
        }
    }
}
