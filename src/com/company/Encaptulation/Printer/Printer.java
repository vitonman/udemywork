package com.company.Encaptulation.Printer;

public class Printer {

    private double toner_level;
    private boolean duplex;

    public Printer(int toner_level) {
        this.toner_level = toner_level;
        this.duplex = false;
    }

    public void fillUpToner(int value){

        if(this.toner_level >= 100){

            System.out.println("Toner level is full");

        } else {

            toner_level =+ value;
            System.out.println("Now toner level is : " + this.toner_level);

        }

    }

    public void printPages(double pages){

        if(isDuplex()){
            //if duplex = true.
            this.toner_level = this.toner_level - (pages/2);

            System.out.println("Printer  working on duplex mode.");
            System.out.println("Printed " + (pages/2) + " pages. Toner level is : " + this.toner_level);

        } else {
            //if duplex = false.
            this.toner_level = this.toner_level - pages;
            System.out.println("Printer not working on duplex mode.");
            System.out.println("Printed " + pages + " pages. Toner level is : " + this.toner_level);

        }


    }

    public double getToner_level() {
        return toner_level;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void makeDuplex(){

        if(this.duplex){

            this.duplex = false;

        } else {

            this.duplex = true;

        }

    }

}
