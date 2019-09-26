package com.company.house_challenge;

public class Chair {
    /*
        Chair chair = new Chair("MyChair", 20, 33.33);
        Table table = new Table("default_table");
        Room room = new Room(20,chair,table);

        House house = new House(room);

        house.useTable();
*/


    private String name;
    private double height;
    private double width;

    public Chair(String name, double height, double width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public void lookAt(){

        System.out.println("You looking at: " + this.name);

    }

}
