package com.company.Encaptulation.Printer;

public class Printer {

    private int toner_level;
    private int pages;
    private boolean duplex;

    public Printer(int toner_level, int pages, boolean duplex) {
        this.toner_level = toner_level;
        this.pages = pages;
        this.duplex = duplex;
    }

    public void fillUpToner(int value){

        if(this.toner_level >= 100){

            System.out.println("Toner level is full");

        } else {

            toner_level =+ value;
            System.out.println("Now toner level is : " + this.toner_level);

        }

    }

    public int getToner_level() {
        return toner_level;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPages() {
        return pages;
    }
}
