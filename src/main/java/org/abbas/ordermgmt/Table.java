package org.abbas.ordermgmt;

import java.util.ArrayList;
import java.util.List;

public class Table {
     private int no;
     private int capacity;
     private List<Table> tables;

    public Table(int no, int capacity) {
        this.no = no;
        this.capacity = capacity;
        this.tables = new ArrayList<>();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }


}
