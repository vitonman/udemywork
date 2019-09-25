package com.company.house_challenge;

public class Room {

    private double size;
    private Chair chair;
    private Table table;

    public Room(double size, Chair chair, Table table) {
        this.size = size;
        this.chair = chair;
        this.table = table;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
