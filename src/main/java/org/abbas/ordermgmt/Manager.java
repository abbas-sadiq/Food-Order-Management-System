package org.abbas.ordermgmt;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Table>tableList;

    public Manager() {
        this.tableList = new ArrayList<>();
    }

    public Table findTable(int tableNo){
        for (Table table : tableList) {
            if(table.getTableNo() == tableNo){
                return table;
            }
            
        }
        return null;
        
    }




}
