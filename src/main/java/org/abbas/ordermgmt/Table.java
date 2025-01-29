package org.abbas.ordermgmt;

public class Table {
    private int tableNo;
    private int capacity;
    private boolean occupied;

    public Table(int tableNo, int capacity) {
        this.tableNo = tableNo;
        this.capacity = capacity;
        this.occupied = false;
    }


    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void occupyTable() {
        if (!occupied) {
            this.occupied = true;
        } else {
            System.out.println("Table " + tableNo + " is already occupied.");
        }
    }

    public void freeTable() {
        if (occupied) {
            this.occupied = false;
        } else {
            System.out.println("Table " + tableNo + " is already free.");
        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNo=" + tableNo +
                ", capacity=" + capacity +
                ", occupied=" + occupied +
                '}';
    }

    public void assignToCustomer() {
    }
}
