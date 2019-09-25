package com.company.house_challenge;

public class Table {

    private String name;

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void use(){

        System.out.println("Yo're using : " + this.name);

    }
}
