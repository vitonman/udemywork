package com.company.ArrayListChallenge;

public class Contacts {

    private String name;
    private int number;

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void getContactInfo(){

        System.out.println(this.name + ": " + this.number);

    }



}
